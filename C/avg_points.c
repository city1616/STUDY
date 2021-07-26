#include <stdio.h>

#define game 10

int main() {

	int score[game];
	int sum = 0;
	int i;
	double avg;

	for(i = 0; i < game; i++) {
		printf("게임 %d에서 선수의 득점은? ", i + 1);
		scanf("%d", &score[i]);
	}

	for(i = 0; i < game; i++) {
		sum += score[i];
	}

	avg = ((double)sum / game);
	printf("평균 득점은 %f입니다.\n", avg);

	return 0;
}