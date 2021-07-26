#include <stdio.h>

struct student
{
	char name[30];
	char career[20];
	int age;
	char phone[30];
};

int main()
{
	int i;

	struct student student[2] = {{"inwoo", "student", 18, "010-3328-4023"},{"mom", "mom", 47, "010-4007-4023"}};

	for(i=0;i<2;i++)
	{
		printf("student%d\n", i);
		printf("name = %s\n", student[i].name);
		printf("career = %s\n", student[i].career);
		printf("age = %d\n", student[i].age);
		printf("phone = %s\n", student[i].phone);

	}

}