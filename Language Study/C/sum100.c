#include <stdio.h>

int main() {
	int sum = 0, n = 0;

	for(n = 0;n <= 100; n++) {
		sum += n;
	}

	printf("%d\n", sum);
}