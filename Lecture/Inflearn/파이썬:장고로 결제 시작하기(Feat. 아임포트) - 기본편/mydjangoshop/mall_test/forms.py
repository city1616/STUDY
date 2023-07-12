from django import forms
from .models import Payment


class PaymentForm(forms.ModelForm):
    class Meta:
        model = Payment
        # fields = "__all__"  # fix : 테스트로 모든 필드를 입력받는다.
        fields = ["name", "amount"]
