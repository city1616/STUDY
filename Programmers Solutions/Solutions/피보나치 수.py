def solution(n) :
    answer = Fibo(n) % 1234567
    print(Fibo(n))
    return answer

def Fibo(a) :
    if a == 0 :
        return 0
    elif a == 1 :
        return 1
    else :
        return (Fibo(a - 1) % 1234567) + (Fibo(a - 2) % 1234567)

solution(3) # 2
solution(5) # 5
solution(100000)
 