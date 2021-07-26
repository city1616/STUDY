#include <stdio.h>

int main()
{
	int i;
	printf("year :\n");
	for(i=1800;i<=2012;i+=4)
	{
		if((i%4==0)&&(i%100!=0)||(i%400==0))
			printf("%10d", i);
	}
	printf("\n");

}