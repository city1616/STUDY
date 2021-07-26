#include <stdio.h>
#include <stdlib.h>

int main() {
	int random = 0;
	int random1 = 0;

	for(int i = 0; i < 10; i++) {
		random = rand() % 9;
		printf("%d\n", random);
	}

	for(int i = 0; i < 10; i++) {
		random1 = rand();
		printf("%d\n", random1);
	}
}