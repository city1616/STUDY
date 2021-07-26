#include <stdio.h>

#define MAX_SIZE 10

void sub(int var, int list[]) {

	var = 10;
	list[0] = 10;
}

int main() {
	int var;
	int list[MAX_SIZE];

	var = 0;
	list[0] = 0;
	sub(var, list);

	printf("var = %d, list[0] = %d\n", var, list[0]);
}