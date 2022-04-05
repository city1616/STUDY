#include <stdio.h>

void main()
{
	int i, k, MenuNum;
	int isinput = 0;
	int NO[2];
	char LINE[79] = {0};
	char Name[2][255] = {0};
	int number[2];
	char major[2][255] = {0};
	double korean[2];
	double math[2];
	double english[2];
	double average[2];
	average[2] = (korean[2] + math[2] + english[2])/3;

	
	printf("---------------------------------- 메  뉴 -----------------------------------\n");
	printf("1. 입력.\n");
	printf("2. 출력.\n");
	printf("3. 종료.\n");
	printf(">>");
	scanf("%d", &MenuNum);
	
	switch(MenuNum)
	{
		case 1 :
			printf("---------------------------------- 정보입력 -----------------------------------\n");
			printf("이름 : ");	scanf("%s", &Name[isinput]);
			printf("학번 : ");	scanf("%d", &number[isinput]);
			printf("전공 : ");	scanf("%s", &major[isinput]);
			printf("국어 : ");	scanf("%lf", &korean[isinput]);
			printf("수학 : ");	scanf("%lf", &math[isinput]);
			printf("영어 : ");	scanf("%lf", &english[isinput]);
			isinput++;
			for(i=0;i<79;i++)
			{
				LINE[i] = '-';
				printf("%c",LINE[i]);
			}
			printf("\n");break;
		case 2 :
			
			printf(" NO:      이름:       학번:            전공:  국어:   수학:  영어:        평균:\n");
			for(i=0;i<79;i++)
			{
				LINE[i] = '-';
				printf("%c",LINE[i]);
			}
			for(k=0;k<=isinput;k++)
			{
			printf("%4d:%10s:%11d:%16s:%6.1lf:%7.1lf:%6.1lf:%12.2e:\n",NO[k], Name[k], number[k], major[k], korean[k], math[k], english[k], average[k]);
			}
			for(i=0;i<79;i++)
			{
				LINE[i] = '-';
				printf("%c",LINE[i]);
			}
		case 3:
			printf("종료\n"); break;

		default : break;
	}
	
}
