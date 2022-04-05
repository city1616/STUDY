#include <stdio.h>

int main(void)
{
    FILE* stream = fopen("ftell.dat", "r");

    fseek(stream, -3, SEEK_END);
    fprintf(stdout, "%c\n", fgetc(stream));

    rewind(stream);  // 파일의 시작 지점으로 돌려 놓음

    fseek(stream, 0, SEEK_CUR);
    fprintf(stdout, "%c\n", fgetc(stream));

    fclose(stream);

    return 0;
}