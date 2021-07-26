#include <stdio.h>

struct score
{
    char name[20];
    double kor, eng, total;
};

typedef struct score STUDENT;

int main(void)
{
    STUDENT s, ss;
    FILE* stream;

    printf("1. 이름 입력 : ");
    fscanf(stdin, "%s", s.name);

    printf("2. 국어 점수, 영어 점수 입력 : ");
    fscanf(stdin, "%lf %lf", &s.kor, &s.eng);
    s.total = s.kor + s.eng;

    stream = fopen("student.dat", "wb");
    if(stream != NULL)
    {
        fwrite(&s, sizeof(s), 1, stream);
        fclose(stream);
    }
    else
    {
        puts("파일 열기 오류");
    }
    stream = fopen("student.dat", "rb");
    if(stream != NULL)
    {
        fread(&ss, sizeof(ss), 1, stream);
        fprintf(stdout, "%s %.2lf %.2lf %.2lf\n", ss.name, ss.kor, ss.eng, ss.total);
        fclose(stream);
    }
    else
    {
        puts("파일 열기 오류");
    }

    return 0;
}