from collections import deque

def solution(s) :
    answer = 0

    print("s :", s)
    s_dict = {}
    for c in s :
        if c not in s_dict :
            s_dict[c] = 1
        else :
            s_dict[c] += 1
    
    print("s_dict :", s_dict)

    print("length :", len(s))

    return answer
 

solution("aabbaccc") # 7
# solution("ababcdcdababcdcd") # 9
# solution("abcabcdede") # 8
# solution("abcabcabcabcdededededede") # 14
# solution("xababcdcdababcdcd") # 17