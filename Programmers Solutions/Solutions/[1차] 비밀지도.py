def solution(n, arr1, arr2) :
    answer = []
    arr_1 = []
    arr_2 = []

    for i in arr1 :
        if len(bin(i)[2:]) <= n - 1 :
            arr_1.append("0" * (n - len(bin(i)[2:])) + bin(i)[2:])
        else :
            arr_1.append(bin(i)[2:])
    for i in arr2 :
        if len(bin(i)[2:]) <= n - 1 :
            arr_2.append("0" * (n - len(bin(i)[2:])) + bin(i)[2:])
        else :
            arr_2.append(bin(i)[2:])

    print(arr_1)
    print(arr_2)

    for i in zip(arr_1, arr_2) :
        tmp = ""
        for j in range(n) :
            if i[0][j] == "1" or i[1][j] == "1" :
                tmp += "#"
            elif i[0][j] == "0" and i[1][j] == "0" :
                tmp += " "
            else :
                print("error")
        answer.append(tmp)
    
    print(answer)
                
    return answer

a = 5
b = [9, 20, 28, 18, 11]
c = [30, 1, 21, 17, 28]
solution(a, b, c)

a = 6
b = [46, 33, 33 ,22, 31, 50]
c = [27 ,56, 19, 14, 14, 10]
solution(a, b, c)