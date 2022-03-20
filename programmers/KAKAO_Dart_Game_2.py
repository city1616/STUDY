# 다른사람 풀이

import re

def solution(dartResult) :
    bonus = {"S" : 1, "D" : 2, "T" : 3}
    option = {"" : 1, "*" : 2, "#" : -1}

    p = re.compile("(\d+)([SDT])([*#]?)")
    print(p)
    
    dart = p.findall(dartResult)
    print(dart)
    
    for i in range(len(dart)) :
        print(dart[i])
    
    for i in range(len(dart)) :
        dart[i] = int(dart[i][0]) ** bonus[dart[i][1]] * option[dart[i][2]]
        if dart[i][2] == "*" and i > 0 :
            dart[i - 1] *= 2
        

    answer = sum(dart)
    print(dart)
    return answer

def solution(dartResult) :
    point = []
    answer = []
    dartResult = dartResult.replace('10', 'k')
    point = ['10' if i == 'k' else i for i in dartResult]
    print(point)

    i = -1
    sdt = ['S', 'D', 'T']
    for j in point :
        if j in sdt :
            answer[i] = answer[i] ** (sdt.index(j) + 1)
        elif j == '*' :
            answer[i] = answer[i] * 2
            if i != 0 :
                answer[i - 1] = answer[i - 1] * 2
        elif j == '#' :
            answer[i] = answer[i] * (-1)
        else:
            answer.append(int(j))
            i += 1
    return sum(answer)

print(solution("1D2S3T*"))