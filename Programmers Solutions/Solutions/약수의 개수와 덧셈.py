def solution(left, right) :
    result = 0
    for i in range(left, right + 1) :
        tmp = []
        for j in range(1, i + 1) :
            if i % j == 0 :
                tmp.append(i)
        if len(tmp) % 2 == 0 :
            result += i
        else :
            result -= i
    print("result :", result)
    return result

a = 13
b = 17
solution(a, b)

a = 24
b = 27
solution(a, b)