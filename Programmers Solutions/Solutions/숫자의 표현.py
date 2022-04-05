def solution(n) :
    answer = 0
    for i in range(1, n + 1) :
        sum = 0
        for j in range(i, n + 1) :
            # print("i :", i, "j :", j)
            sum += j
            if sum == n :
                answer += 1
                break
            elif sum > n :
                break
    print("answer :", answer)
    return answer

a = 15 # 4
solution(a)

a = 3 # 2
solution(a)

