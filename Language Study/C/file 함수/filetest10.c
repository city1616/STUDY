#include <stdio.h>

int main(void)
{
    FILE* stream;
    long distance;

    stream = fopen("ftell.dat", "w");
    fputs("ABCDEFGHIJ", stream);
    fclose(stream);

    stream = fopen("ftell.dat", "r");

    fseek(stream, -8, SEEK_END);  // 파일의 끝 지점에서 8바이트 (역으로) 떨어진 지점
    fprintf(stdout, "%c\n", fgetc(stream));

    distance = ftell(stream);
    printf("거리 : %ld\n", distance);

    fclose(stream);

    return 0;
}