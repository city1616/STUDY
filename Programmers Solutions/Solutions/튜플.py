def solution(s) :
    answer = []
    print("s :", s)
    print("s :", s[1 : -1])
    s = s[1 : -1].split("},{")
    print("s :", s)

    t = []
    for i in s :
        # print(i)
        if i[0] == "{" :
            t.append(list(map(int, i[1 :].split(","))))
        elif i[-1] == "}" :
            t.append(list(map(int, i[:-1].split(","))))
        else :
            t.append(list(map(int, i.split(","))))
    t = sorted(t, key = lambda x : len(x))
    print("t :", t)
    answer.append(t[0][0])
    for i in t :
           
  
    return answer

# solution("{{2},{2,1},{2,1,3},{2,1,3,4}}")
solution("{{1,2,3},{2,1},{1,2,4,3},{2}}")
# solution("{{20,111},{111}}")
# solution("{{123}}")
# solution("{{4,2,3},{3},{2,3,4,1},{2,3}}")