#include <stdio.h>

int main(void)
{
    FILE* stream;
    int buffer1[3] = {0x00ff11aa, 0x00ff11aa, 0x21567890};
    int buffer2[3];

    stream = fopen("student.dat", "wb");
    if(stream != NULL)
    {
        fwrite(buffer1, sizeof(int), 3, stream);
        fclose(stream);
    }
    else
    {
        puts("파일 열기 오류");
    }

    stream = fopen("student.dat", "rb");
    if(stream != NULL)
    {
        fread(buffer2, sizeof(int), 3, stream);
        printf("%x %x %x\n", buffer2[0], buffer2[1], buffer2[2]);
        fclose(stream);
    }
    else
    {
        puts("파일 열기 오류");
    }

    return 0;
}