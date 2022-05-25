T = int(input())

for test_case in range(1, T + 1) :
    N = int(input())
    cost = list(map(int, input().split()))

    money = 0
    cnt = 0
    total = 0
    m = cost[len(cost) - 1]
    for i in reversed(range(len(cost) - 1)) :
        if cost[i] < m :
            money += cost[i]
            cnt += 1
        else :
            total += m * cnt - money
            money = 0
            cnt = 0
            m = cost[i]
    total += m * cnt - money
    print("#" + str(test_case), total)


# 3
# 3
# 10 7 6
# 3
# 3 5 9
# 5
# 1 1 3 1 2