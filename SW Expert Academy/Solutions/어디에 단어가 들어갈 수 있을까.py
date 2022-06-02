T = int(input())

for test_case in range(1, T + 1) :
    N, K = map(int, input().split())
    p = []
    for _ in range(N) :
        tmp = list(map(int, input().split()))
        p.append(tmp)
    
    cnt = 0
    result = 0

    for i in range(N) :
        for j in range(N) :
            if p[i][j] == 1 :
                cnt += 1
            else :
                cnt = 0
    print("cnt :", cnt)
    print("#" + str(test_case))

# 0 0 1 1 1
# 1 1 1 1 0
# 0 0 1 0 0
# 0 1 1 1 1
# 1 1 1 0 1