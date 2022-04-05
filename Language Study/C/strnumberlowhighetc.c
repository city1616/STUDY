#include <stdio.h>

int main()
{
	char str[100];
	char num[100];
	char low[100];
	char high[100];
	char etc[100];
	int i, n=0,l=0,h=0,e=0;

	printf("입력:");
	gets(str);

	for(i=0;str[i]!='\0';i++)
	{
		if(str[i]>='0'&&str[i]<='9')
			num[n++]=str[i];
		else if(str[i]>='a'&& str[i]<='z')
			low[l++]=str[i];
		else if(str[i]>='A'&& str[i]<='Z')
			high[h++]=str[i];
		else
			etc[e++]=str[i];
	}

	printf("\nnumber :");
	for(i=0;i<n;i++)
		printf("%c", num[i]);
	printf("\nlow :");
	for(i=0;i<n;i++)
		printf("%c", low[i]);
	printf("\nhigh :");
	for(i=0;i<n;i++)
		printf("%c", high[i]);
	printf("\netc :");
	for(i=0;i<n;i++)
		printf("%c", etc[i]);
	printf("\n");
}