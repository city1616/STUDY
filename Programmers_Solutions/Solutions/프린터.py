def solution(priorities, location) :
    pri = [(i, priorities[i]) for i in range(len(priorities))]
    print(pri)
    cnt = 0
    i = 1
    while len(pri) > 0 :
        # print("i : ", i, "priorities :", pri, end = " ")
        l = len(pri)
        front = pri.pop(0)
        for j in pri :
            if j[1] > front[1] :
                pri.append(front)
                break
        if len(pri) == l - 1 :
            cnt += 1
            if front[0] == location :
                print(cnt)
                return cnt
        # print("cnt :", cnt)
        i += 1
    # print(cnt)
    return 0

a = [2, 1, 3, 2]
b = 2
solution(a, b)

a = [1, 1, 9, 1, 1, 1]
b = 0
solution(a, b)