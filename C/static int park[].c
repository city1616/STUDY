#include <stdio.h>
static int park[2][3] = {{1,2}, {3,4,5}};

int main()
{
	int i, j;
	for(i=0; i<2; i++)
	{
		for (int j = 0; j < 3; j++)
		{
			printf("%d", park[i][j]);
		}
		printf("\n");
	}
	printf("\n");
}