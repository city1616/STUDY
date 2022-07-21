import sys

sys.stdin = open("../Input/input_1974.txt", "r")

T = int(input())

for test_case in range(1, T + 1) :
    arr = []
    new_arr = []
    tmp = []
    err = 0
    result = 0
    for i in range(9) :
        arr.append(list(map(int, input().split())))
    
    # row
    for i in range(9) :
        for j in range(9) :
            if j + 1 != sorted(arr[i])[j] :
                err += 1
                break
    
    # col
    for i in range(9) :
        for j in range(9) :
            tmp.append(arr[j][i])
        for k in range(9) :
            if k + 1 != sorted(tmp)[k] :
                err += 1
                break
        tmp = []
    
    tmp = []
    for l in range(3) :
        for k in range(3) :
            for i in range(3) :
                for j in range(3) :
                    tmp.append(arr[3 * l + i][3 * k + j])
            new_arr.append(tmp)
            tmp = []

    # row
    for i in range(9) :
        for j in range(9) :
            if j + 1 != sorted(new_arr[i])[j] :
                err += 1
                break
    
    if err > 0 :
        print("#" + str(test_case) + " 0")
    else :
        print("#" + str(test_case) + " 1")
