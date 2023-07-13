from django.contrib import admin
from .models import Category, Product


@admin.register(Category)
class CategoryAdmin(admin.ModelAdmin):
    list_display = ["pk", "name"]
    list_display_links = ["name"]


@admin.register(Product)
class ProductAdmin(admin.ModelAdmin):
    search_fields = ["name"]
    list_display = ["category", "name", "price", "status"]
    list_display_links = ["name"]
    list_filter = ["category", "status", "created_at", "updated_at"]
    date_hierarchy = "updated_at"
    actions = ["make_active"]

    @admin.display(description=f"지정 상품을 {Product.Status.ACTIVE.label} 상태로 변경합니다.")
    def make_active(self, request, queryset):
        count = queryset.update(  # 하나의 쿼리로 실행, 적용된 행의 개수 반환
            status=Product.Status.ACTIVE
        )
        self.message_user(
            request, f"{count}개의 상품을 {Product.Status.ACTIVE.label} 상태로 변경했습니다."
        )

        # for product in queryset:  # 선택한 쿼리 개수 만큼 update 함수가 반복 수행됨
        #     product.status = Product.Status.ACTIVE
        #     product.save()
