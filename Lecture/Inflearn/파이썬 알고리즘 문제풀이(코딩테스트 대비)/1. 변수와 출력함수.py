# 1. 변수와 출력함수

'''
변수명 정하기
1) 영문과 숫자, _로 이루어진다.
2) 대소문자를 구분한다.
3) 문자나, _로 시작한다.
4) 특수문자를 사용하면 안된다.(&, % 등)
5) 키워드를 사용하면 안된다.(if, for 등)
'''

# 값 교환
a, b = 10, 20
print(a, b) # 10 20
a, b = b, a
print(a, b) # 20 10

# 변수 타입 -> type()
a = 12345

a = 12.123456789123456789123456789
print(a) # 12.123456789123457   실수 -> 8byte
print(type(a)) # <class 'float'> 

a = "student"
print(a) # student
print(type(a)) # <class 'str'>

# 출력방식
print("number") # number
a, b, c = 1, 2, 3
print(a, b, c) # 1 2 3
print("number : ", a, b, c) # number : 1 2 3
print(a, b, c, sep = ",") # 1, 2, 3
print(a, b, c, sep = "")  # 123

# 줄바꿈 : \n
print(a, b, c, sep = "\n") # == print(a) print(b) print(c)
# 1
# 2
# 3
print(a, end = " ")
print(b, end = " ")
print(c) # 1 2 3
