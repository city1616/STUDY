# Solution 1

def solution(s) :
    answer = 0

    # print("s :", s)

    for i in range(len(s)) :
        m = s[i : ] + s[ : i]
        print(i, ". m :", m, end = "   ")

        for _ in range(int(len(s) / 2)) :
            # m = m.replace("()", "")
            # m = m.replace("[]", "")
            # m = m.replace("{}", "")

            m = m.replace("()", "").replace("[]", "").replace("{}", "")
        
        if len(m) == 0 :
            answer += 1
            print("O")
        else :
            print("X")
    print("answer :", answer)
    return answer

solution("[](){}") # 3
# solution("}]()[{") # 2
# solution("[)(]") # 0
# solution("}}}") # 0

# Solution 2

from collections import deque

def check(s) :
    while True :
        if "()" in s :
            s = s.replace("()", "")
        elif "{}" in s :
            s = s.replace("{}", "")
        elif "[]" in s :
            s = s.replace("[]", "")
        else :
            return False if s else True

def solution(s) :
    answer = 0
    que = deque(s)

    for i in range(len(s)) :
        if check("".join(que)) :
            answer += 1
        que.rotate(-1)
    return answer

print(solution("[](){}"))