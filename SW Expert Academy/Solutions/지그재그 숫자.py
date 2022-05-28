T = int(input())

for test_case in range(1, T + 1) :
    
    N = int(input())
    if N % 2 == 1 :
        total = (N // 2) * -1 + N 
    else :
        total = (N // 2) * -1

    print("#" + str(test_case), total)
