T = int(input())

for test_case in range(1, T + 1) :
    num = list(map(int, input().split()))
    max = 0
    for n in num :
        if max < n :
            max = n

    print("#" + str(test_case), max)