# solution 1

from collections import deque

def solution(s) :
    s_list = deque()
    for c in s :
        if c == "(" :
            s_list.append(c)
        else :
            if len(s_list) == 0 :
                return False
            else :
                s_list.pop()
    if len(s_list) == 0 :
        return True
    else :
        return False

# solution 2 -> 효율성 시간 초과

def solution(s) :
        
    # print("s :", s)
    for _ in range(int(len(s) / 2)) :
        s = s.replace("()", "")
        if s == "" :
            return True

    print("s :", s)
    print("length :", len(s))

    return False

print(solution("()()")) # true
print(solution("(())()")) # true
print(solution(")()(")) # false
print(solution("(()(")) # false
print(solution("(((())))")) # true