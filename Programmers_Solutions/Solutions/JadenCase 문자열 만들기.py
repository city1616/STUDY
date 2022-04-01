def solution(s) :
    answer = ""
    for i in range(len(s)) :
        if i == 0 :
            answer += s[0].upper()
        elif s[i - 1] == " " :
            answer += s[i].upper()
        else :
            answer += s[i].lower()
    print(answer)
    return answer

a = "3people unFollowed me"
b = "for the last week"
c = "333 333 333"
d = "3aeaea a3a3a3 333aaa"
e = "3a a a33aasdfasdf a3 a43433"
f = "a     1a"

solution(a)
solution(b)
solution(c)
solution(d)
solution(e)
solution(f)