#include <stdio.h>

int main(void)
{
    FILE* stream;
    stream = fopen("fseek.dat", "w");
    fputs("ABCDEFGHIJ", stream);
    fclose(stream);

    stream = fopen("fseek.dat", "r");

    fseek(stream, 0, SEEK_SET);  // 파일의 시작 지점
    fprintf(stdout, "%c\n", fgetc(stream));

    fseek(stream, 2, SEEK_SET);  // 파일의 시작 지점에서 2바이트 떨어진 지점
    fprintf(stdout, "%c\n", fgetc(stream));

    fseek(stream, 0, SEEK_CUR);  // 파일의 현재 지점
    fprintf(stdout, "%c\n", fgetc(stream));

    fseek(stream, 0, SEEK_CUR);  // 파일의 현재 지점
    fprintf(stdout, "%c\n", fgetc(stream));

    fseek(stream, -1, SEEK_END);  // 파일의 끝 지점에서 1바이트 (역으로) 떨어진 지점
    fprintf(stdout, "%c\n", fgetc(stream));

    fseek(stream, -2, SEEK_CUR);  // 파일의 현재 지점에서 2바이트 (역으로) 떨어진 지점
    fprintf(stdout, "%c\n", fgetc(stream));

  fclose(stream);

    return 0;
}