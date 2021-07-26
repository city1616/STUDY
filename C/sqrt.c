#include <stdio.h>
#include <matn.h>

int main() {
	double a, b, c, dis, value;
	printf("계수 a를 입력하시오:");
	scanf("%lf", &a);
	printf("계수 b를 입력하시오:");
	scanf("%lf", &b);
	printf("계수 c를 입력하시오:");
	scanf("%lf", &c);

	if(a == 0) {
		value = -c / b;
		printf("방정식의 근은 %lf입니다.\n", value);
	}

	else {
		dis = b * b - 4.0 * a * c;
		if(dis > 0) {
			value = sqrt(dis);
			printf("방정식의 근은 %lf입니다.\n", (-b + value)/(2.0 * a));
			printf("방정식의 근은 %lf입니다.\n", (-b - value)/(2.0 * a));
		}

		else if(dis == 0) {
			printf("방정식의 근은 %lf입니다.\n", (-b) / (2.0 * a));
		}

		else {
			printf("실근이 존재하지 않습니다.\n");
		}
	}
}