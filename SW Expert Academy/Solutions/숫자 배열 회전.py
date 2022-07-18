import sys

sys.stdin = open("../Input/input_1961.txt", "r")

T = int(input())

for test_case in range(1, T + 1) :
    N = int(input())
    arr = []
    new_arr = []
    result = []
    for i in range(N) :
        arr.append(list(map(int, input().split())))
    
    for k in range(3) :
        arr = list(zip(*arr[::-1]))
        for i in range(N) :
            tmp = ""
            for j in range(N) :
                tmp += str(arr[i][j])
            new_arr.append(tmp)

    print("#" + str(test_case))

    for i in range(N) :
        for j in range(3) :
            print(new_arr[N * j + i], end = " ")
        print()