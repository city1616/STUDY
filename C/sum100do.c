#include <stdio.h>

int main() {
	int sum = 0, n = 0;

	do {
		n++;
		sum += n;

	}while(n < 100);

	printf("%d\n", sum);
}