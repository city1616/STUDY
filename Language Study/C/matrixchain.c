//컴퓨터공학과 20152986 문승우

#include <stdio.h>
#include <limits.h>

int MatrixChain(int p[], int n)
{
     int C[n][n];
 
    int i, j, k, L, temp;
 
    
    for (i = 1; i < n; i++)
        C[i][i] = 0;
 
    for (L = 1; L < n - 1; L++)
    {
    	printf("L = %d\n", L);

        for (i = 1; i < n - L; i++)
        {
        	printf("i = %d   ", i);

            j = i + L;
            C[i][j] = INT_MAX;
            printf("j = %d\n", j);

            for (k = i; k <= j - 1; k++)
            {
            	printf("k = %d\n", k);

                temp = C[i][k] + C[k+1][j] + p[i-1] * p[k] * p[j];
                if (temp < C[i][j]) {

                	C[i][j] = temp;

                }
                printf("C[%d][%d] = %d\n\n", i, j, temp);
            }
            printf("So C[%d][%d] = %d\n\n", i, j, C[i][j]);
        }
    }

    return C[1][n - 1];
}
 
int main()
{
	int a; //arry size
	printf("Enter the arry size\n"); //arry 배열의 사이즈를 입력합니다.
	scanf("%d", &a);
    int arry[a];
    for(int b = 0; b < a; b++) {
    	printf("Enter the number of Matrix\n"); //행렬을 입력합니다. ex) (50 * 10) 곱하기 (10 * 15) 는 50 10 15를 입력해줍니다.
    	scanf("%d", &arry[b]);
    }
    int size = sizeof(arry)/sizeof(arry[0]);
 
    printf("Minimum number of multiplications is %d \n", MatrixChain(arry, size));
 
}