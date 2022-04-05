# 2. 변수입력과 연산자

a = input("숫자를 입력하세요 : ")
print(a)

a, b = input("숫자를 입력하세요 : ").split() # str형식으로 저장됨
print(a, b) # 2 3

c = a + b
print(c) # 23 -> str 연결됨

print(type(a)) # <class 'str'>
print(type(b)) # <class 'str'>
print(type(c)) # <class 'str'>

a = int(a) # str to int
print(type(a)) # <class 'int'>

a, b = map(int, input("숫자를 입력하세요 : ").split())
print(a + b) # 5

# a = 3, b = 2
print(a + b) # 5
print(a - b) # 1
print(a * b) # 6
print(a / b) # 1.5
print(a // b) # 1 몫
print(a % b) # 1  나머지
print(a ** b) # 9 거듭제곱

a = 4.3 # 실수
b = 5   # 정수
c = a + b # 실수 
print(type(a)) # <class 'float'>
print(type(b)) # <class 'int'>
print(type(c)) # <class 'float'>
print(c) # 9.3