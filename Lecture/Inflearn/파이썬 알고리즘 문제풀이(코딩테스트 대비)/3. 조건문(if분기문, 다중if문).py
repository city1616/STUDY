# 3. 조건문(if분기문, 다중if문)

'''
== : 같다.
!= : 같지 않다.
'''

# 조건문 if문
x = 7
if x == 7 :
	print("Lucky")
	print("Good") # 들여쓰기 잘못할 경우 에러 발생함

# 조건문 if(중첩)
x = 15
if x >= 10 :
	if x % 2 == 1 :
		print("10 이상의 홀수")

x = 9
if x > 0 :
	if x < 10 :
		print("10 보다 작은 자연수")

x = 7
if x > 0 and x < 10 : # == if 0 < x < 10 :
	print("10 보다 작은 자연수")

# 조건문 if(분기)
x = 10
if x > 0 :
	print("양수")
else :
	print("음수")

# 다중 if문
x = 93
if x >= 90 :
	print("A")
elif x >= 80 :
	print("B")
elif x >= 70 :
	print("C")
elif x >= 60 :
	print("D")
else :
	print("F")