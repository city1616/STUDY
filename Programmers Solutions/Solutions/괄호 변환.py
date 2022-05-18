def solution(p) :
    answer = ""
    
    print("p :", p)

    if check(p) :
        print("올바른 괄호 문자열")
        return p
    else :
        u, v = div(p)
        if check(u) :
            answer += u
        else :
            answer += total(u)
        if check(v) :
            answer += v
        else :
            while True :
                u, v = div(v)
                if check(u) :
                    answer += u
                else :
                    answer += total(u)
                if check(v) :
                    answer += v
                    break
                elif v == "" :
                    break
    # print("u :", u, "v :", v)
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
    return u, v

def total(s) :
    tmp = ""
    for c in s[1 : -1] :
        if c == "(" :
            tmp += ")"
        else :
            tmp += "("
    return "(" + tmp + ")"

# solution("(()())()") # "(()())()"
# solution(")(") # "()"
# solution("()))((()") # "()(())()"
# solution(")()(()")
# solution("))))((((")
# solution("))(()(")
solution("))()((")