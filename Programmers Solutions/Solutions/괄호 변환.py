def solution(p) :
    answer = ""
    
    print("p :", p)

    first_c, second_c = 0, 0

    for c in p :
        if c == "(" :
            first_c += 1
        else :
            second_c += 1

    print("first_c :", first_c)
    print("second_c :", second_c)
    
    p_mod = p
    for _ in range(int(len(p) / 2)) :
        p_mod = p_mod.replace("()", "")

    print("p_mod :", p_mod)
    u, v = "", ""

    if p_mod == "" :
        print("올바른 괄호 문자열")
        return p
    else :
        for i in range(len(p)) :
            u += p[i]
            if p[i] == "(" :
                first_c += 1
            else :
                second_c += 1
            if first_c == second_c : 
                v += p[i + 1 :]
                break  


    return answer

# solution("(()())()") # "(()())()"
solution(")(") # "()"
# solution("()))((()") # "()(())()"