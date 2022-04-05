def solution(progresses, speeds) :
    answer = []
    day = []
    cnt = 1

    for i in range(len(progresses)) : # 작업에 걸리는 시간 계산 
        # print("progress :", progresses[i], "speed :", speeds[i])
        if (100 - progresses[i]) % speeds[i] == 0 :
            day.append((100 - progresses[i]) // speeds[i])
        else :
            day.append(((100 - progresses[i]) // speeds[i]) + 1)
    
    print("day :", day)
    front = day[0]
    while len(day) > 0 :
        # print("day length :", len(day))
        
        day.pop(0)
        if len(day) == 0 :
            answer.append(cnt)
        elif day[0] > front :
            front = day[0]
            answer.append(cnt)
            cnt = 1
        else :
            cnt += 1
            if len(day) == 0 :
                answer.append(cnt)
        print("front  :", front)
        print("answer :", answer)
    return answer

a = [93, 30, 55]
b = [1, 30, 5]
# solution(a, b)

a = [95, 90, 99, 99, 80, 99]
b = [1, 1, 1, 1, 1, 1]
solution(a, b)

a = [99, 99]
b = [1, 1]
# solution(a, b)

a = [55, 60, 65]
b = [5, 10, 7]
# solution(a, b)