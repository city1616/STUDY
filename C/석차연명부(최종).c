#include <string.h>
#include <stdio.h>
#define SIZE 2

int insertList(char name[][255], int* stdNum, char major[][255], double *korean, double * math, double *english, int size);
void printListElmt(int no, char* name, int stdNum, char* major, double korean, double math, double english);
void printList(char name[][255], int *stdNum, char major[][255], double *korean, double *math, double *english, int size);
void searchList(char name[][255], int* stdNum, char major[][255], double *korean, double * math, double *english, int size);
void swap(int* val1, int* val2);
int deleteList(char name[][255], int* stdNum, char major[][255],double *korean, double * math, double *english, int size);

const char linestart[] = "----------------------------------- 메  뉴 -----------------------------------\n";
const char inputMent[] = "---------------------------------- 정보입력 ---------------------------------\n";
const char printMent[] = "-----------------------------------------------------------------------------\n";

int main()              //원래 비쥬얼스튜디오에서 void
{
    int menuNum;
    int isInput = 0;
    int isExcute = 1;
    int i = 0, j = 0;
    int tmp;
    int size = 0;

    char Name[2][255] = { 0 }, Major[2][255] = { 0 };

    int printOption = 0;
    double Korean[2], Math[2], English[2];

    int stdNum[2];

    while (isExcute)
    {
        printf("%s", linestart);
        printf("1. 입력.\n");
        printf("2. 출력.\n");
        printf("3. 검색.\n");
        printf("4. 삭제.\n");
        printf("5. 종료.\n>> ");
        scanf("%d", &menuNum);

        switch (menuNum)
        {
        case 1://입력
            size = insertList(Name, stdNum, Major, Korean, Math, English, SIZE);
            break;
        case 2:    //출력                    
            printList(Name, stdNum, Major, Korean, Math, English, size);
            break;
        case 3://검색
            searchList(Name, stdNum, Major, Korean, Math, English, size);
            break;
        case 4://삭제
            size = deleteList(Name, stdNum, Major, Korean, Math, English, size);
            break;
        case 5://종료
            isExcute = 0;
            break;
        default:
            printf("잘못입력하였습니다.");
        }
    }
}


int insertList(char name[][255], int* stdNum, char major[][255], double *korean, double * math, double *english, int size)
{
    int inputNum = 0;

    for (inputNum = 0; inputNum < size; inputNum++)
    {
        if (name[inputNum][0] == 0)
        {
            break;
        }
    }
    if (inputNum < size)
    {
        printf("%s", inputMent);
        printf("이름 : ");
        scanf("%s", name[inputNum]);
        printf("학번 : ");
        scanf("%d", &stdNum[inputNum]);
        printf("전공 : ");
        scanf("%s", major[inputNum]);
        printf("국어 : ");
        scanf("%lf", &korean[inputNum]);
        printf("수학 : ");
        scanf("%lf", &math[inputNum]);
        printf("영어 : ");
        scanf("%lf", &english[inputNum]);
        printf("%s\n", printMent);
    }
    return inputNum + 1;
}

void printList(char name[][255], int *stdNum, char major[][255], double *korean, double *math, double *english, int size)
{
    int i, j;
    int printOption = 0;
    int printOrder[SIZE];
    int tmp;

    float koreanSum = 0, mathSum = 0, EnglishSum = 0;
    float totalEver = 0;

    //swap함수를 통해 학생의 순서를 바꿀 때, 포인터를 통해 가르키는 주소를 교체하기 위해
    for (i = 0; i<sizeof(printOrder) / sizeof(int); i++){
        printOrder[i] = i;
    }


    printf("*** 출력 옵션 ***\n");
    printf("1. 이름순\n");
    printf("2. 학번순\n");
    printf("3. 성적순\n");
    scanf("%d", &printOption);

    switch (printOption)
    {
    case 1://이름순
        for (i = 0; i < size; i++)
        {
            for (j = i + 1; j < size; j++)
            {
                if (strcmp(name[i], name[j]) > 0)
                {
                    swap(&printOrder[i], &printOrder[j]);//두 학생의 순서를 바꿈
                }
            }
        }
        break;
    case 2://학번순
        for (i = 0; i < size; i++)
        {
            for (j = i + 1; j < size; j++)
            {
                if (stdNum[i] > stdNum[j])
                {
                    swap(&printOrder[i], &printOrder[j]);//두 학생의 순서를 바꿈
                }
            }
        }
        break;
    case 3://성적순
        for (i = 0; i < size; i++)
        {
            for (j = i + 1; j < size; j++)
            {
                //국,영,수를 더한 성적을 비교
                if (korean[i] + english[i] + math[i] < korean[j] + english[j] + math[j])
                {
                    swap(&printOrder[i], &printOrder[j]);//두 학생의 순서를 바꿈
                }
            }
        }
        break;
    }

    printf(printMent);
    printf("%3s|%8s |%10s |%16s | %4s | %4s | %4s | %9s | \n", "NO", "이름", "학번", "전공", "국어", "수학", "영어", "평균");
    printf(printMent);

    for (i = 0, j = 0; i < size; i++)
    {
        j = printOrder[i];
        if (name[j][0] != 0)
        {
            koreanSum += korean[j];
            mathSum += math[j];
            EnglishSum += english[j];
            printListElmt(i, name[j], stdNum[j], major[j], korean[j], math[j], english[j]);
        }
    }

    printf("%3s|%8s |%10s |%16s | %3.1lf | %3.1lf | %3.1lf | %3.2le | \n", " ", "총합", " ", " ", koreanSum, mathSum, EnglishSum, (koreanSum + mathSum + EnglishSum) / 3.0);
}

void swap(int* val1, int* val2)
{
    int tmp;
    tmp = *val1;
    *val1 = *val2;
    *val2 = tmp;
}

void printListElmt(int no, char* name, int stdNum, char* major, double korean, double math, double english)
{

    printf("%3d|%8s |%10d |%16s | %3.1lf | %3.1lf | %3.1lf | %3.2le | \n", no, name, stdNum, major, korean, math, english, (korean + math + english) / 3.0);
    printf(printMent);
}

void searchList(char name[][255], int* stdNum, char major[][255], double *korean, double * math, double *english, int size)
{

    int searchOption = 0;
    char searchName[255] = { 0, };
    int searchStdNum = 0;
    char searchMajor[255] = { 0, };
    int i = 0, j = 0;
    float koreanSum = 0, mathSum = 0, EnglishSum = 0;
    printf("***검색 옵션***\n1.이름\n2.학번\n3.전공\n>>");
    scanf("%d", &searchOption);
    switch (searchOption)
    {
    case 1:
        printf("\n*** 이름을 입력하세요 ***\n");
        scanf("%s", searchName);
        printf("%s", printMent);
        printf("%3s|%8s |%10s |%16s | %4s | %4s | %4s | %9s | \n", "NO", "이름", "학번", "전공", "국어", "수학", "영어", "평균");
        printf("%s", printMent);
        for (i = 0; i < SIZE; i++){
            if (strcmp(searchName, name[i]) == 0)
            {
                koreanSum += korean[i];
                mathSum += math[i];
                EnglishSum += english[i];
                printListElmt(i, name[i], stdNum[i], major[i], korean[i], math[i], english[i]);
            }
        }
        break;
    case 2:
        printf("\n*** 학번을 입력하세요 ***\n");
        scanf("%d", &searchStdNum);
        printf("%s", printMent);
        printf("%3s|%8s |%10s |%16s | %4s | %4s | %4s | %9s | \n", "NO", "이름", "학번", "전공", "국어", "수학", "영어", "평균");
        printf("%s", printMent);
        for (i = 0; i < SIZE; i++)
        {
            if (searchStdNum == stdNum[i])
            {
                koreanSum += korean[i];
                mathSum += math[i];
                EnglishSum += english[i];
                printListElmt(i, name[i], stdNum[i], major[i], korean[i], math[i], english[i]);
            }
        }
        break;
    case 3:
        printf("\n*** 학과를 입력하세요 ***\n");
        scanf("%s", searchMajor);
        printf("%s", printMent);
        printf("%3s|%8s |%10s |%16s | %4s | %4s | %4s | %9s | \n", "NO", "이름", "학번", "전공", "국어", "수학", "영어", "평균");
        printf("%s", printMent);
        for (i = 0; i < SIZE; i++)
        {
            if (strcmp(searchMajor, major[i]) == 0)
            {
                koreanSum += korean[i];
                mathSum += math[i];
                EnglishSum += english[i];
                printListElmt(i, name[i], stdNum[i], major[i], korean[i], math[i], english[i]);
            }
        }
        printf("%s", printMent);
        printf("%3s|%8s |%10s |%16s | %3.1f | %3.1f | %3.1f | %3.2e | \n", " ", "총합", " ", " ", koreanSum, mathSum, EnglishSum, (koreanSum + mathSum + EnglishSum) / 3.0);
        break;
    }
}

int deleteList(char name[][255], int* stdNum, char major[][255],double *korean, double * math, double *english, int size){

    int searchStdNum = 0;
    int i = 0, j = 0;
    char answer;
    char delIndex = -1;

    printf("\n*** 삭제할 학번을 입력하세요 ***\n");
    scanf("%d", &searchStdNum);
    fflush(stdin);
    for (i = 0; i<size; i++){
        if (searchStdNum == stdNum[i]){
            printf(printMent);
            printListElmt(i, name[i], stdNum[i], major[i], korean[i], math[i], english[i]);
            printf("정말 삭제하시 겠습니까? <y, n>");
            scanf("%c", &answer);
            if (answer == 'y'){
                delIndex = i;
            }
        }
    }
    if (delIndex != -1){
        for (i = delIndex; i<size - 1; i++){
            strcpy(name[i], name[i + 1]);
            stdNum[i] = stdNum[i + 1];
            strcpy(major[i], major[i + 1]);
            korean[i] = korean[i + 1];
            math[i] = math[i + 1];
            english[i] = english[i + 1];
        }
        printf("삭제 되었습니다.\n");
    }
    return size - 1;

}