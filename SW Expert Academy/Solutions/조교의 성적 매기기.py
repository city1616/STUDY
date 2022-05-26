T = int(input())

for test_case in range(1, T + 1) :
    N , K = map(int, input().split())
    grade = ["A+", "A0", "A-", "B+", "B0", "B-", "C+", "C0", "C-", "D0"]
    point = []
    total_point = {}
    for _ in range(N) :
        mid, fin, rep = map(int, input().split())
        point.append(round(mid * 0.35 + fin * 0.45 + rep * 0.2, 3))
    point_sort = sorted(point, reverse = True)
    cnt = 0
    tmp = 0
    for i in range(N) :
        total_point[point_sort[i]] = grade[cnt]
        tmp += 1
        if tmp == N // 10 :
            tmp = 0
            cnt += 1

    print("#" + str(test_case), total_point[point[K - 1]])