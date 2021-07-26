//
//  main.c
//  StructStudentGrade
//
//  Created by SeungWoo Mun on 2019/06/08.
//  Copyright © 2019 SeungWoo Mun. All rights reserved.
//

#include <stdio.h>
#include <string.h>
#include <stdlib.h>

struct student {
    char *name;
    double grade;
};
typedef struct student Student;

void swap(Student *, Student *);

int main() {
    Student *std[10] = {0};
    FILE *fp;
    char buffer[80];
    double d;
    int i, j, count = 0;
    //printf("%lu\n", sizeof(buffer)/sizeof(buffer[0]));    //buffer배열의 크기
    
    for(i = 0; i < 10; i++) {
        
        printf("학생이름 입력: ");
        fgets(buffer, sizeof(buffer), stdin);           //학생 이름 입력
        buffer[strlen(buffer) - 1] = 0;                 //이건 잘 모르겠음;;;근데 중요한거같음;;;
        //gets(buffer);                             //비추! 사용자가 80문자 이상을 입력할 수 있음, 80문자가 넘어가면 메모리 침범이 일어나고 데이터가 사라질수있음!
        //scanf("%s", &buffer);
        if(buffer[0] == 0) {              //Enter만 입력했는지 확인
            break;
        }
        
        printf("학생성적 입력: ");
        scanf("%lf", &d);
        
        std[i] = (Student*)malloc(sizeof(Student));     //구조체 하나 동적할당
        std[i]->name = (char *)malloc(sizeof(char));      //구조체의 name에 필요한 크기 만큼 동적할당
        strcpy(std[i]->name, buffer);       //name에 입력된 이름 복사
        //std[i]->name = buffer;
        std[i]->grade = d;           //grade에 입력된 평점 대입
        
        count++;
        getchar();
        fflush(stdin);
        
    }
    
    
    
    //여기에서 이름순으로 올림차순 sorting
    for(i = 0; i < count - 1; i++) {
        for(j = 0; j < count - 1 - i; j++) {
            if(strcmp(std[j]->name, std[j + 1]->name) > 0) {
                swap(std[j], std[j + 1]);
            }
        }
    }
    /*for(j = 0; j < count - 1; j++) {
        if(strcmp(std[j]->name, std[j + 1]->name) > 0) {
            swap(std[j], std[j + 1]);
        }
    }*/
    
    //파일 open
    fp = fopen("Sorted.txt", "w");
    
    puts("-- 이름의 올림차순으로 정렬된 학생 --");
    for(j = 0; j < count; j++) {
        printf("%s %.1lf\n", std[j]->name, std[j]->grade);
    }
    
    fputs("-- 이름의 올림차순으로 정렬된 학생 --\n", fp);
    for(j = 0; j < count; j++) {
        fprintf(fp, "%s %.1lf\n", std[j]->name, std[j]->grade);
    }
    
    //소트 결과를 화면과 파일에 형식을 갖춰 출력
    
    //여기에서 평점순으로 내림차순으로 sorting
    for(i = 0; i < count - 1; i++) {
        for(j = 0; j < count - 1 - i; j++) {
            if(std[j]->grade < std[j + 1]->grade) {
                swap(std[j], std[j + 1]);
            }
        }
    }
    
    puts("-- 평점의 내림차순으로 정렬된 학생 --");
    for(i = 0; i < count; i++) {
        printf("%s %.1lf\n", std[i]->name, std[i]->grade);
    }
    
    fputs("-- 평점의 내림차순으로 정렬된 학생 --\n", fp);
    for(i = 0; i < count; i++) {
        fprintf(fp, "%s %.1lf\n", std[i]->name, std[i]->grade);
    }
    //소트 결과를 화면과 파일에 형식을 갖춰 출력
    fclose(fp);         //파일 close
    
    return 0;
    
}

void swap(Student * s, Student * t) {       //두 구조체 변수를 교환하는 함수
    Student temp;
    
    temp = *s;
    *s = *t;
    *t = temp;
    
    /*char ctmp;
    double tmp;
    
    ctmp = *s->name;
    s->name = t->name;
    *t->name = ctmp;
    
    tmp = s->grade;
    s->grade = t->grade;
    t->grade = tmp;*/
    
}


