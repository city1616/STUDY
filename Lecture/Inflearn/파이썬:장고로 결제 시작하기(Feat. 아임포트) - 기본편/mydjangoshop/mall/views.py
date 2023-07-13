import json

from django.conf import settings
from django.contrib import messages
from django.contrib.auth.decorators import login_required
from django.forms import modelformset_factory
from django.http import HttpResponse
from django.shortcuts import get_object_or_404, redirect, render
from django.urls import reverse
from django.views.decorators.csrf import csrf_exempt
from django.views.decorators.http import require_POST
from django.views.generic import ListView

# from mall.decorators import deny_from_untrusted_hosts
from mall.forms import CartProductForm
from mall.models import Product, CartProduct, Order, OrderPayment


# def product_list(request):
#     # Product.objects.all()만 수행할 경우 template에서 외래키인 category를 뒤늦게 참조하여 많은 양의 쿼리가 발생한다.
#     # N + 1 문제를 해결하기 위해 select_related("category")를 통해 product를 조회할 때 외래키 데이터까지 한번에 조회 하도록 한다.
#     # 조회하는데 걸리는 시간이 10배 단축됨
#     product_qs = Product.objects.all().select_related("category")
#     return render(
#         request,
#         "mall/product_list.html",
#         {
#             "product_list": product_qs,
#         },
#     )
#     pass


class ProductListView(ListView):
    model = Product
    queryset = Product.objects.filter(status=Product.Status.ACTIVE).select_related(
        "category"
    )
    paginate_by = 6  # 4개 단위로 끊어서 보여준다.

    def get_queryset(self):
        qs = super().get_queryset()

        query = self.request.GET.get("query", "")
        if query:
            qs = qs.filter(name__icontains=query)
        return qs


product_list = ProductListView.as_view()


@login_required
def cart_detail(request):
    cart_product_qs = (
        CartProduct.objects.filter(
            user=request.user,
        )
        .select_related("product")
        .order_by("product__name")
    )

    CartProductFormSet = modelformset_factory(
        model=CartProduct, form=CartProductForm, extra=0, can_delete=True
    )

    if request.method == "POST":
        formset = CartProductFormSet(
            data=request.POST,
            queryset=cart_product_qs,
        )
        if formset.is_valid():
            formset.save()
            messages.success(request, "장바구니를 업데이트했습니다.")
            return redirect("cart_detail")
    else:
        formset = CartProductFormSet(
            queryset=cart_product_qs,
        )

    return render(
        request,
        "mall/cart_detail.html",
        {
            "formset": formset,
        },
    )


@login_required
@require_POST
def add_to_cart(request, product_pk):
    product_qs = Product.objects.filter(
        status=Product.Status.ACTIVE,
    )
    product = get_object_or_404(product_qs, pk=product_pk)

    quantity = int(request.GET.get("quantity", 1))

    cart_product, is_created = CartProduct.objects.get_or_create(
        user=request.user, product=product, defaults={"quantity": quantity}
    )

    if not is_created:
        cart_product.quantity += quantity
        cart_product.save()

    # messages.success(request, "장바구니에 추가했습니다.")

    # return redirect("product_list")

    # redirect_url = request.META.get("HTTP_REFERER", "product_list")
    # return redirect(redirect_url)

    return HttpResponse("OK")


@login_required
def order_list(request):
    order_qs = Order.objects.all().filter(user=request.user, status=Order.Status.PAID)
    return render(
        request,
        "mall/order_list.html",
        {
            "order_list": order_qs,
        },
    )


@login_required
def order_new(request):
    cart_product_qs = CartProduct.objects.filter(user=request.user)

    order = Order.create_from_cart(request.user, cart_product_qs)
    cart_product_qs.delete()

    return redirect("order_pay", order.pk)


@login_required
def order_pay(request, pk):
    order = get_object_or_404(Order, pk=pk, user=request.user)

    if not order.can_pay():
        messages.error(request, "현재 결제를 할 수 없는 주문입니다.")
        return redirect(order)

    payment = OrderPayment.create_by_order(order)

    # check_url = reverse("order_check", args=[order.pk, payment.pk])

    payment_props = {
        "merchant_uid": payment.merchant_uid,
        "name": payment.name,
        "amount": payment.desired_amount,
        "buyer_name": payment.buyer_name,
        "buyer_email": payment.buyer_email,
        "m_redirect_url": "root",
        # "m_redirect_url": request.build_absolute_uri(check_url),
    }

    return render(
        request,
        "mall/order_pay.html",
        {
            "portone_shop_id": settings.PORTONE_SHOP_ID,
            "payment_props": payment_props,
            "next_url": "root",
        },
    )
