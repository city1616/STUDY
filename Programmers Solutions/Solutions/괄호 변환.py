def solution(p) :
    answer = ""
    
    print("p :", p)

    if check(p) :
        print("올바른 괄호 문자열")
        return p
    else :
        answer += div(p)
            
    print("answer :", answer)
    return answer

def check(s) :
    for _ in range(int(len(s) / 2)) :
        s = s.replace("()", "")
        if s == "" :
            break
    if s :
        return False
    else :
        return True

def div(s) :
    if s == "" :
        return ""
    u, v = "", ""
    first_c, second_c = 0, 0
    for i in range(len(s)) :
            u += s[i]

            if s[i] == "(" :
                first_c += 1
            else :
                second_c += 1

            if first_c == second_c : 
                v += s[i + 1 :]
                break
    if check(u) :
        return u + div(v)
    else :
        return "(" + div(v) + ")" + total(u)

def total(s) :
    tmp = ""
    for c in s[1 : -1] :
        if c == "(" :
            tmp += ")"
        else :
            tmp += "("
    return tmp

# solution("(()())()") # "(()())()"
# solution(")(") # "()"
# solution("()))((()") # "()(())()"
# solution(")()(()")
# solution("))))((((")
# solution("))(()(")
solution("))()((")