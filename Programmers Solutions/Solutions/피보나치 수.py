# solution 1

def solution(n) :
    fibo = [0, 1]
    for i in range(2, n + 1) :
        fibo.append(fibo[i - 2] + fibo[i - 1])

    print(fibo[n])
    return fibo[n] % 1234567

# 시간초과
# def solution(n) :
#     answer = Fibo(n) % 1234567
#     print(Fibo(n))
#     return answer

# def Fibo(a) :
#     if a == 0 :
#         return 0
#     elif a == 1 :
#         return 1
#     else :
#         return (Fibo(a - 1) % 1234567) + (Fibo(a - 2) % 1234567)

solution(3) # 2
solution(5) # 5
solution(100000)
 
# solution 2

def fibonacci(n) :
    a, b = 0, 1
    for i in range(n) :
        a, b = b, a + b
    return a

print(fibonacci(3))