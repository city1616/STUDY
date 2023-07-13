from django.views.generic import ListView

from mall.models import Product


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
    queryset = Product.objects.all().select_related("category")
    paginate_by = 4  # 4개 단위로 끊어서 보여준다.

    def get_queryset(self):
        qs = super().get_queryset()

        query = self.request.GET.get("query", "")
        if query:
            qs = qs.filter(name__icontains=query)
        return qs


product_list = ProductListView.as_view()
