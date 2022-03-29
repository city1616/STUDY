def solution(N, stages) :
    answer = []
    stage = {i : 0 for i in range(1, N + 1)}
    print(stage)

    for i in stage.keys() :
        p = 0
        c = 0
        for s in stages :
            if s >= i :
                p += 1
            if s == i :
                c += 1
        if c != 0 and p != 0 :
            stage[i] = c / p
    print(stage)
    stage = sorted(stage.values(), reverse = True)
    print(stage)
    # for i in stage :
    #     print(i[0], end = " ")
    # for i in s 
    return answer

a = 5
b = [2, 1, 2, 6, 2, 4, 3, 3]
solution(a, b)

print()

a = 4
b = [4,4,4,4,4]
# solution(a, b)