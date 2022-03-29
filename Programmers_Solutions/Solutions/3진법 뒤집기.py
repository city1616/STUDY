import math

def solution(n) :
    triple = ""
    answer = 0
    if n < 3 :
        print(n)
        return n
    else :
        while True :
            triple += str(n % 3) 
            if n // 3 == 0 :
                break
            n = n // 3
    print("triple :", triple)
    for i in range(len(triple)) :
        answer += int(triple[i]) * math.pow(3, len(triple) - 1 - i)
    print("answer :", int(answer))
    return int(answer)

a = 45
b = 125
c = 1
d = 2
e = 0
k = 1

solution(a)
solution(b)
solution(c)
solution(d)
solution(e)
solution(k)