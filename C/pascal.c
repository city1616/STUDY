#include <stdio.h>
int main()
{
	int i, j, pas[10][10];
	printf("\n\n");
	for (i = 0; i < 10; ++i)
	{
		pas[i][0] = 1;
		for(j= 1; j<i; j++)
			pas[i][j] = pas[i-1][j-1] + pas[i-1][j];
		pas[i][j] = 1;
	}
	for (i = 0; i < 10; ++i)
	{
		printf("%*s", 2*(10-i),"");
		for(j=0; j<=i; j++)
			printf("%3d",pas[i][j]);
		printf("\n");
	}
}