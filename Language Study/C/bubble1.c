//  Created by 문지수 on 26/05/2019.
//  Copyright © 2019 문지수. All rights reserved.
//

#include <stdio.h>
#include <stdlib.h>
#include <string.h>

void swap_ptr(char **, char **);

int main()
{
    char input[100]; // 문자열 입력
    char *str[20] = {0}; // 동적 할당 위해 연결할 포인터
    int cnt = 0; // 입력받는 갯수
    int i = 0, j = 0; // 배열 위치
    
    printf("- Input String -\n");
    
    while(1) // 문자열 입력
    {
        printf("Input : ");
        gets(input);
        
        if(strcmp(input, "") == 0) // 엔터치면 break
            break;
        str[i] = (char *)malloc(sizeof(char)*(strlen(input) + 1));
        
        if(input[cnt] == NULL) // 입력 없으면 메모리 에러 출력
        {
            printf("MEMORY ERROR\n");
            exit(1);
        }
        strcpy(str[i], input); // 문자열 복사
        cnt++;
        i++;
    }
    
    // 입력받은 순서데로 출력하기
    
    printf("\n");
    printf("- Original String -");
    printf("\n");
    for(i = 0 ; i < cnt ; i++)
    {
        puts(str[i]);
    }
    printf("\n");
    
    // 버블정렬
    
    for(i = 0 ; i < cnt - 1 ; i++)
    {
        for(j = 0 ; j < cnt - (i + 1) ; j++)
        {
            if(strcmp(str[j], str[j + 1]) > 0)
                swap_ptr(str[j], str[j + 1]);
        }
    }
    printf("\n");
    
    printf("- Sorted String -\n");
    for(i = 0 ; i < cnt ; i++)
    {
        puts(str[i]);
    }
    for(i = 0 ; i < cnt ; i++)
        free(str[i]);
    return 0;
}

void swap_ptr(char **pa, char **pb)
{
    char * tmp;
    
    tmp = *pb;
    *pb = *pa;
    *pa = tmp;
}