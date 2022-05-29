T = int(input())

for test_case in range(1, T + 1) :
    N, M = map(int, input().split())
    place = []
    for _ in range(N) :
        line = list(map(int, input().split()))
        place.append(line)
    
    val = 0
    attack = []
    for i in range(N - M + 1) :
        for j in range(N - M + 1) :
            for c in range(M) :
                for k in range(M) :
                    val += place[i + c][j + k]
            attack.append(val)
            val = 0

    print("#" + str(test_case), max(attack))

# 1 3 3 6 7
# 8 13 9 12 8
# 4 16 11 12 6
# 2 4 1 23 2
# 9 13 4 7 3