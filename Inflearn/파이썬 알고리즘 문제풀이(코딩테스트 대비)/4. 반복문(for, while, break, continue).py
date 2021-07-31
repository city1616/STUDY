# 4. 반복문(for, while, break, continue)

# 반복문(for, while)

# range : 순차적으로 정수 리스트를 만드는 함수
a = range(10)    # 0 ~ 9
print(list(a))   # [0, 1, 2, 3, 4, 5, 6, 7, 8, 9]

a = range(1, 11) # 1 ~ 10
print(list(a))   # [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]


# for
for i in range(10) :
	print("hello") # hello 10번 출력

for i in range(10) :
	print(i) # 0 ~ 9 한줄씩 출력

for i in range(1, 11) :
	print(i) # 1 ~ 10 한줄씩 출력

for i in range(10, 0, -1) : # 10부터 1까지 -1씩 작아짐
	print(i) # 10 ~ 1

for i in range(10, 0, -2) : # 10부터 2까지 -2씩 작아짐
	print(i) # 10 8 6 4 2


# while
i = 1
while i <= 10 :
	print(i) # 1 ~ 10 한줄씩 출력 
	i = i + 1

i = 10
while i >= 1 :
	print(i) # 10 ~ 1 한줄씩 출력
	i = i - 1


# break : 반복문을 빠져나감
i = 1
while True : # 무한 반복문
	print(i)
	if i == 10 :
		break # for문 탈출 1부터 10까지 출력
	i += 1 # i = i + 1


# continue : 반복문에서 continue 밑의 코드를 실행하지않고 지나감
for i in range(1, 11) :
	if i % 2 == 0 : # 짝수
		continue
	print(i) # 1 3 5 7 9


# for else : for문에서 break를 실행하지 않고 정상적으로 종료될 경우 else 코드 실행
for i in range(1, 11) :
	print(i)
	if i == 15 :
		break
else :
	print(11) # 11 출력