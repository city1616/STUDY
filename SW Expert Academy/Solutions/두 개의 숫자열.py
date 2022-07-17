import sys

sys.stdin = open("../Input/input_1959.txt", "r")

T = int(input())

for test_case in range(1, T + 1) :
    N, M = map(int, input().split())
    A = list(map(int, input().split()))
    B = list(map(int, input().split()))
    tmp = 0
    total = []
    result = 0

    if N > M :
        for i in range(N - M + 1) :
            for j in range(M) :
                tmp += B[j] * A[j + i]
            total.append(tmp)
            tmp = 0
        result = max(total)
    elif N < M :
        for i in range(M - N + 1) :
            for j in range(N) :
                tmp += A[j] * B[j + i]
            total.append(tmp)
            tmp = 0
        result = max(total)
    else :
        for i in range(N) :
            result += A[i] * B[i]

    print("#" + str(test_case), result)