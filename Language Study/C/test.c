#include <stdio.h>

int main()
{
	int a;
	char name[35];
	char c;
	int i, s;

	printf("What's your age?\n");
	scanf("%d", &a);
	printf("What's your name?\n");
	scanf("%s", name);
	printf("Hello!\n%s!\n", name);

	printf("한자리 문자를 입력하시오.\n");
	scanf("%c", &c);
	 switch(c)
	 {
	 	case 'a': printf("c is 'A'\n"); break;
	 	case 'b': printf("c is 'B'\n"); break;
	 	case 'c': printf("c is 'C'\n"); break;
	 	case 'd': printf("c is 'D'\n"); break;
	 	case 'e': printf("c is 'E'\n"); break;
	 	default : printf("I don't know.\n");
	 }

	 printf("\n\n");
	for(i=1;i<=10;i++)
	{
		s = s + i;
	}
	printf("1 + 2 + 3 + ... + 10 = %d\n", s);

	int h;
	printf("Enter the number! = ");
	scanf("%d", &h);

	if(h>=0)
		printf("Number is +.\n");
	else
		printf("Number is -\n");



}