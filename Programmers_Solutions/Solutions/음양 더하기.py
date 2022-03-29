def solution(absolutes, signs) :
    total = 0
    for a, s in zip(absolutes, signs) :
        if s :
            total += a
        else :
            total -= a
    print(total)
    return sum([absolutes[i] for i in range(len(absolutes)) if signs[i] == True]) - sum([absolutes[i] for i in range(len(absolutes)) if signs[i] == False])

a = [4, 7, 12]
b = [True, False, True]
solution(a, b)

a = [1, 2, 3]
b = [False, False, True]
solution(a, b)