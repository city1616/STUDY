#include <stdio.h>

int notscore(int score);                //점수가 0이상 100이하인지 확인하는 함수
int CheckstNum(int num);                //학생수가 1이상 30이하인지 확인하는 함수
void printList(int stNum, int NumScore[][4]);           //입력받은 학생수, 학번점수를 이용해서 출력을 하는 함수
char GetGrade(float Average);
void Endprogram(void);

const char printMent[] = "=============================================\n";             //그냥 반복해서 출력할 수 있어서 배열로 지정, 여러번 쓸 수 있음

int main() {
    
    int stNum;          //학생수(학생번호)
    
    printf("학생수를 입력하시오(최대 30 명) : ");
    scanf("%d", &stNum);                    //학생수 입력
    
    if(CheckstNum(stNum) == 1) {            //학생수가 1이상 30이하인지 검사하는 함수 호출
        printf("학생수 오류!!\n");
        Endprogram();
        return 0;                           //프로그램 종료
    }
    
    int NumScore[stNum][4];                         //순번, 수시1, 수시2, 수시3 배열 생성   //행 : 학생수 , 열 : 4(순번, 수시1, 수시2, 수시3)
    
    for(int i = 0; i < stNum; i++) {                //학생수 만큼 반복해서 순번, 수시1, 수시2, 수시3을 입력을 받음
        printf("%d 번째 학생 학번입력 : ", i+1);
        scanf("%d", &NumScore[i][0]);               //i번째 학생 학번 입력
        
        printf("%d 번째 학생 1 횟수 성적 입력 : ", i+1);
        scanf("%d", &NumScore[i][1]);               //i번째 학생 수시1 점수 입력
        if(notscore(NumScore[i][1]) == 1) {         //점수가 0이상 100이하가 아니면 오류
            printf("점수 오류!!\n");
            Endprogram();
            return 0;                               //프로그램 종료
        }
        printf("%d 번째 학생 2 횟수 성적 입력 : ", i+1);
        scanf("%d", &NumScore[i][2]);               //i번째 학생 수시2 점수 입력
        if(notscore(NumScore[i][2]) == 1) {         //점수가 0이상 100이하가 아니면 오류
            printf("점수 오류!!\n");
            Endprogram();
            return 0;                               //프로그램 종료
        }
        printf("%d 번째 학생 3 횟수 성적 입력 : ", i+1);
        scanf("%d", &NumScore[i][3]);               //i번째 학생 수시3 점수 입력
        if(notscore(NumScore[i][3]) == 1) {         //점수가 0이상 100이하가 아니면 오류
            printf("점수 오류!!\n");
            Endprogram();
            return 0;                               //프로그램 종료
        }
    }
    printList(stNum, NumScore);                     //출력 함수 호출
    Endprogram();                                       //프로그램 종료
    return 0;
    
}

int notscore(int score) {                           //점수가 0이상 100이하인지 검사하는 함수
    if(score < 0 || score > 100) {                  //점수가 0미만 또는 100초과 이면 1 반환 --> 오류
        return 1;
    }
    else {                                          //점수가 0이상 100이하이면 0 반환 --> 맞는 값
        return 0;
    }
}

int CheckstNum(int num) {                           //학생수가 1이상 30이하인지 검사하는 함수
    if(num < 1 || num > 30) {                       //학생수가 1미만 또는 30초과이면 1 반환 --> 오류
        return 1;
    }
    else {                                          //학생수가 1이상 30이하이면 0 반환 --> 맞는 값
        return 0;
    }
}

void printList(int stNum, int NumScore[][4]) {      //학생수와 순번, 수시점수를 받아와서 출력하는 함수
    
    int tmp = 0;                                    //수시1, 수시2, 수시3의 평균을 구할 때 수시1, 수시2, 수시3의 총합계를 임시로 저장해 놓을 정수값
    int Sum[stNum];                                 //학생별 수시1, 수시2, 수시3의 총합계를 저장할 배열
    float Average[stNum];                           //학생별 수시1, 수시2, 수시3의 평균을 저장할 배열
    char Grade[stNum];                              //학생별 학점을 저장할 배열
    float avg[3];                                   //수시1, 수시2, 수시3의 평균을 저장할 배열
    int Max[4] = {0};                               //수시1, 수시2, 수시3, 총점의 최고점을 저장할 배열
    int Min[4] = {10000, 10000, 10000, 10000};      //수시1, 수시2, 수시3, 총점의 최저점을 저장할 배열
    float Maxavg = 0, Minavg = 10000;               //수시1, 수시2, 수시3의 평균의 최고점, 최저점을 저장할 실수형 선언
    
    for(int i = 0; i < stNum; i++) {                //학생별 수시1, 수시2, 수시3의 총점 구하기
        Sum[i] = NumScore[i][1] + NumScore[i][2] + NumScore[i][3];
    }
    for(int i = 0; i < stNum; i++) {                //학생별 수시1, 수시2, 수시3의 평균 구하기
        Average[i] = Sum[i] / 3.0;
    }
    for(int i = 0; i < stNum; i++) {                //학생별 학점 구하기
        /*if(Average[i] >= 90) {                      //평균이 90이상이면 A
            Grade[i] = 'A';
        }
        else if(Average[i] >= 80) {                 //평균이 80이상 90미만이면 B
            Grade[i] = 'B';
        }
        else if(Average[i] >= 70) {                 //평균이 70이상 80미만이면 C
            Grade[i] = 'C';
        }
        else if(Average[i] >= 60) {                 //평균이 60이상 70미만이면 D
            Grade[i] = 'D';
        }
        else {                                      //평균이 60미만이면 F
            Grade[i] = 'F';
        }*/
        Grade[i] = GetGrade(Average[i]);
    }
    for(int i = 0; i < 3; i++) {                    //수시1, 수시2, 수시3의 평균
        for(int j = 0; j < stNum; j++) {
            tmp += NumScore[j][i + 1];              //tmp에 수시1, 수시2, 수시3의 값을 더해주다
        }
        avg[i] = tmp / (float)stNum;                //tmp(총점)의 값을 학생수로 나눠준다
        tmp = 0;                                    //수시1의 평균을 구하고 난 다음 수시2의 평균을 구해야 하기때문에 다시 0으로 초기화를 시켜주어야 한다. 그러지 않으면 수시1총점에 계속해서 수시2점수를 더하기 되기 때문에 초기화가 필요!!
    }
    
    for(int i = 0; i < 3; i++) {
        for(int j = 0; j < stNum; j++) {
            if(Max[i] <= NumScore[j][i + 1]) {      //수시1, 수시2, 수시3의 최고
                Max[i] = NumScore[j][i + 1];        //max값보다 수시1, 수시2, 수시3 점수가 크거나 같으면 max에 수시1, 수시2, 수시3점수를 저장해준다
            }
            if(Min[i] >= NumScore[j][i + 1]) {      //수시1, 수시2, 수시3의 최저
                Min[i] = NumScore[j][i + 1];        //min값보다 수시1, 수시2, 수시3 점수가 작거나 같으면 min에 수시1, 수시2, 수시3점수를 저장해준다
            }
        }
    }
    
    for(int i = 0; i < stNum; i++) {
        if(Max[3] <= Sum[i]) {          //총점의 최고
            Max[3] = Sum[i];            //max값보다 총점의 값이 크거나 같으면 max에 sum의 값을 저장해준다
        }
        if(Min[3] >= Sum[i]) {          //총점의 최저
            Min[3] = Sum[i];            //min값보다 총점의 값이 작거나 같으면 min에 sum의 값을 저장해준다
        }
        if(Maxavg <= Average[i]) {      //평균의 최고
            Maxavg = Average[i];        //maxavg값보다 평균의 값이 크거나 같으면 maxavg에 average의 값을 저장해준다    average값이 큰게 나오면 maxavg에 큰값을 입력
        }
        if(Minavg >= Average[i]) {      //평균의 최저
            Minavg = Average[i];        //minavg값보다 평균의 값이 작거나 같으면 minavg에 average의 값을 저장해준다    average값이 작은게 나오면 minavg에 작은값 입력
        }
    }
    
    printf(printMent);                  //======출력
    //printf("학번  수시1   수시2   수시3   총점   평균   학점\n");
    printf("%7s %9s %9s %9s %9s %9s %9s\n", "학번", "수시1", "수시2", "수시3", "총점", "평균", "학점");
    printf(printMent);
    for(int i = 0; i < stNum; i++) {                //학번, 수시1, 수시2, 수시3, 총점, 평균, 학점 출력
        printf("%3d %5d %5d %6d %7d %7.1f %7c\n", NumScore[i][0], NumScore[i][1], NumScore[i][2], NumScore[i][3], Sum[i], Average[i], Grade[i]);
    }
    printf(printMent);
    
    printf("평균 : %4.1f %5.1f %6.1f\n", avg[0], avg[1], avg[2]);                         //평균 출력
    printf("최고 : %4d %4d %6d %6d %6.1f\n", Max[0], Max[1], Max[2], Max[3], Maxavg);     //최고 출력
    printf("최저 : %4d %4d %6d %6d %6.1f\n", Min[0], Min[1], Min[2], Min[3], Minavg);     //최저 출력
    
}

char GetGrade(float Average) {               //학점을 구하는 함수
    if(Average >= 90) {                      //평균이 90이상이면 A
        return 'A';
    }
    else if(Average >= 80) {                 //평균이 80이상 90미만이면 B
        return 'B';
    }
    else if(Average >= 70) {                 //평균이 70이상 80미만이면 C
        return 'C';
    }
    else if(Average >= 60) {                 //평균이 60이상 70미만이면 D
        return 'D';
    }
    else {                                      //평균이 60미만이면 F
        return 'F';
    }
}

void Endprogram() {                         //프로그램 종료전 출력
    int i;                                  //학생수 체크, 점수 체크, 실행을 마친 후 프로그램을 종료하기 전에 입력할 정수
    printf("아무 숫자나 누르시오!!");
    scanf("%d", &i);                        //정수 입력
}
