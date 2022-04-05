// 문자열 정렬(배열) 
 
#include <stdio.h>
#include <string.h>

int main() 
{
	char name[5][10];
	int i, j, n;
	char  tmp[10];
	n = sizeof(name)/sizeof(char[10]);
	
	
	printf(" [%d] 명의 이름 입력\n", n );
	
	for( i=0; i<n; i++ )
	{
		printf(" [%d]번째 이름 : ", i);
		fgets( name[i], sizeof(char[10]), stdin);
		name[i][strlen(name[i])-1] = 0;
	}
		
	puts(" \n * 원 본 출 력 * ");
	for( i=0; i<n; i++ )
	{
		printf(" [%d]번 째 이름 ==> %s \n", i, name[i]);
	}
	 
	 
	for( i=0; i<n-1; i++ )
	{
		for( j=0; j<n-1-i; j++ )
		{
			if( strcmp( name[j], name[j+1]) > 0 )
			{
				strcpy( tmp, name[j] );
				strcpy( name[j], name[j+1]);
				strcpy( name[j+1], tmp );
			}
		}
	}
	 	 	 
	puts(" \n * 정 열 후 * ");
	for( i=0; i<n; i++ )
	{
		printf(" [%d]번 째 이름 ==> %s \n", i, name[i]);
	}	 
	 	 	 		 					 		 
	return 0;
} 
[출처] C언어 문자열 정렬 ( 배열과 포인터의 차이 )|작성자 양주종