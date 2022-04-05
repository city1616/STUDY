def solution(s) :
    answer = ""

    s = list(map(int, s.split()))

    answer += str(min(s)) + " " + str(max(s))

    print("answer :", answer)

    return answer

solution("1 2 3 4")
solution("-1 -2 -3 -4")
solution("-1 -1")