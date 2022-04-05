#include <stdio.h>
#include <stdlib.h>
#include <time.h>

#define MAX 100 //00000000000000 // 컴퓨터 죽을수도!!!!!!
// 최댓값 조절하세요!!!!(long long int~=9경 2천억)

typedef struct _node
{
	long long int data;
	struct _node * left;
	struct _node * right;
}node, *pnode;

void post_order(pnode htree);
void make_node(pnode htree, long long int data);
pnode init_node(long long int data);
void pre_order(pnode htree);
void in_order(pnode htree);

int main()
{
	long long int count=MAX;// 배열의 길이 
	long long int *list;//배열 
	int i,j;// 카운터 
	long long int num[MAX] = { 0, }; //난수넣을 배열

	srand((unsigned)time(NULL));//난수 초기화

	printf("배열의 길이는 %d입니다.\n",MAX);
	list = (long long int *)malloc((sizeof(long long int)) * count);

	for (i = 0;i<MAX;i++)
	{
		num[i] = rand() % MAX + 1; //1~MAX까지 수 뽑기
		for (j = 0;j < i;j++) {
			if (num[i] == num[j])  //중복시
			{
				i--;  // 제거
				break;
			}
		}
	}

	for (i = 0;i < MAX;i++)
	{ 
		list[i] = num[i];
		printf(" %llu \n", list[i]);
	}

	pnode htree = init_node(list[0]);

	for (i = 1;i<count;i++)
		make_node(htree, list[i]);

	printf("전위 순회");
	pre_order(htree);
	printf("\n중위 순회");
	in_order(htree);
	printf("\n후위 순회");
	post_order(htree);
	printf("\n");


}

pnode init_node(long long int data)//루트 노드 생성 
{
	pnode ret = (pnode)malloc(sizeof(node));//루트 노드의 생성 
	ret->data = data;
	ret->right = NULL;
	ret->left = NULL;
	return ret;
}

void make_node(pnode htree, long long int data)// 노드의 추가 
{
	pnode make;
	make = (pnode)malloc(sizeof(node));
	make->data = data;
	make->left = NULL;
	make->right = NULL;// 노드를 미리 생성한다. 

	if (htree->data < data)//오른쪽에 추가 
	{
		if (htree->right)
			make_node(htree->right, data);// 오른쪽 으로 탐색 
		else
			htree->right = make;
	}
	else if (htree->data > data)// 왼쪽에 추가 
	{
		if (htree->left)
			make_node(htree->left, data);//왼쪽 으로 탐색 
		else
			htree->left = make;
	}
	else//같은 경우 
	{
		free(make); // 노드 삭제 
		return;
	}

	return;
}


void pre_order(pnode htree)//전위 순회 
{
	if (htree)
	{
		printf("%lld ", htree->data);// 노드를 방문 
		pre_order(htree->left);// 왼쪽을 순회 
		pre_order(htree->right);//오른쪽을 순회 
	}

}

void in_order(pnode htree)//중위 순회 
{
	if (htree)
	{
		in_order(htree->left);// 왼쪽을 순회 
		printf("%lld ", htree->data);// 노드를 방문 
		in_order(htree->right);//오른쪽을 순회 
	}

}

void post_order(pnode htree)//후위 순회 
{
	if (htree)
	{
		post_order(htree->left);// 왼쪽을 순회 
		post_order(htree->right);//오른쪽을 순회 
		printf("%lld ", htree->data);// 노드를 방문 
	}
}