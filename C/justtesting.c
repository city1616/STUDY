//20152986 문승우 컴퓨터공학과
//27번 문제 

#include <stdio.h>
#include <malloc.h>
#include <string.h>

void main() {

	struct test {
		int i;
		char str[20];

	};
	struct test *p;

	p = (struct test *)malloc(sizeof(struct test));

	if( p == NULL) {
		printf("memory error");
		return ;
	}

	p->i = 100;
	strcpy(p->str, "just testing");
	free(p);

}