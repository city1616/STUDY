T = int(input())

for test_case in range(1, T + 1) :
    N = int(input())
    print("#" + str(test_case))

    layer = [1]
    for i in range(1, N + 1) :
        tmp = []
        if i == 1 :
            print("1")
        else :
            print("1", end = " ")
            tmp.append(1)
            for l in range(len(layer) - 1) :
                tmp.append(layer[l] + layer[l + 1])
                print(layer[l] + layer[l + 1], end = " ")
            tmp.append(1)
            layer = tmp
            print("1")