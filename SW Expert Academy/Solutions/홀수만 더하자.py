T = int(input())

for test_case in range(1, T + 1) :
    num = list(map(int, input().split()))
    total = 0
    for i in num :
        if i % 2 == 1 :
            total += i
    print("#" + str(test_case), total)