#include <stdio.h>

int main(void)
{
    FILE* stream1;
    FILE* stream2;

    char buffer[50];

    stream1 = fopen("data1.txt", "r");
    stream2 = fopen("data2.txt", "w");

    if((stream1 != NULL) && (stream2 != NULL))
    {
        while(!feof(stream1))
        {
            fgets(buffer, sizeof(buffer), stream1);
            fputs(buffer, stream2);
        }
        fclose(stream1);
        fclose(stream2);
    }
    else
    {
        puts("파일 열기 오류");
    }

    return 0;
}