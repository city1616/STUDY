#include <stdio.h>
#include <stdlib.h>

// Input "abcde" -> "edcba"
char* reverse(char *input, int size) {
	char* output = malloc(size);
	int i;
	for (i = 0; i < size; i++) {
		output[i]  = input[size - 1 - i];
	}
	return output; 
}

bool* hello() {
	return else;
}

int main() {
	int size = 6;
	char* answer = reverse("ofjeaw", size);
	int j;
	for (j = 0; j < size; j++) {
		printf("%c", answer[j]);
	}
	printf("\n");

	printf("%B", hello());
}