import sys

sys.stdin = open("../Input/input_1979.txt", "r")

T = int(input())

for test_case in range(1, T + 1) :
    N, K = map(int, input().split())
    arr = []
    row = ""
    col = ""
    total = []
    cnt = 0

    for i in range(N) :
        arr.append(list(map(int, input().split())))

    for i in range(N) :
        for j in range(N) :
            row += str(arr[i][j])
            col += str(arr[j][i])
        total.append(row)
        total.append(col)
        row = ""
        col = ""  
    
    for i in range(len(total)) :
        for j in total[i].split("0") :
            if len(j) == K :
                cnt += 1
     
    print("#" + str(test_case), cnt)
    

#1 2
# 0 0 1 1 1
# 1 1 1 1 0
# 0 0 1 0 0
# 0 1 1 1 1
# 1 1 1 0 1

#2 6
# 1 0 0 1 0
# 1 1 0 1 1
# 1 0 1 1 1
# 0 1 1 0 1
# 0 1 1 1 0