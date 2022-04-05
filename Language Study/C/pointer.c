//20152986 문승우 컴퓨터공학과
//26번 문제

#include <stdio.h>

int main() {
	
	int x[] = {1, 2, 3, 4, 5, 6};
	int *p = &x[2];

	printf("%d %d %d\n", *(p+3), *(p-2), *(p+3) * *(p-2));
}