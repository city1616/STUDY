# solution 1

def solution(s) :
    answer = []
    print("s :", s)
    print("s :", s[1 : -1])
    s = s[1 : -1].split("},{")
    print("s :", s)
    t = []
    if len(s) == 1 :
        t.append([int(s[0][1 : -1])])
    else :
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
    # answer.append(t[0][0])
    print("answer :", answer)
    for i in t :
        for j in i :
            if j not in answer :
                answer.append(j)
    print("answer :", answer)
  
    return answer

# solution("{{2},{2,1},{2,1,3},{2,1,3,4}}")
# solution("{{1,2,3},{2,1},{1,2,4,3},{2}}")
# solution("{{20,111},{111}}")
# solution("{{123}}")
solution("{{4,2,3},{3},{2,3,4,1},{2,3}}")

# solution 2

def solution(s) :
    answer = []
    s1 = s.lstrip('{').rstrip('}').split('},{')
    print("s1 :", s1)

    new_s = []
    for i in s1 :
        new_s.append(i.split(","))
    print("new_s :", new_s)

    new_s.sort(key = len)
    print("new_s :", new_s)

    for i in new_s :
        for j in range(len(i)) :
            if int(i[j]) not in answer :
                answer.append(int(i[j]))
    print("answer :", answer)
    return answer

solution("{{4,2,3},{3},{2,3,4,1},{2,3}}")