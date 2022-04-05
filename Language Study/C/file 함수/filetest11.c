#include <stdio.h>

int main(void)
{
    FILE* stream = fopen("ftell.dat", "r");
    fseek(stream, 0, SEEK_END);
    printf("파일의 크기 : %ld바이트\n", ftell(stream));
    fclose(stream);

    return 0;
}