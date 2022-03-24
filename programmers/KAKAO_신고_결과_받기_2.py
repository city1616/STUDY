def solution(id_list, report, k) :
    answer = [0] * len(id_list)
    # print(answer)
    reports = {x : 0 for x in id_list}
    # print(reports)

    for r in set(report) :
        reports[r.split()[1]] += 1
    # print(reports)
    
    for r in set(report) :
        if reports[r.split()[1]] >= k :
            answer[id_list.index(r.split()[0])] += 1
    
    return answer

solution(["muzi", "frodo", "apeach", "neo"], ["muzi frodo","apeach frodo","frodo neo","muzi neo","apeach muzi"], 2)
solution(["con", "ryan"], ["ryan con", "ryan con", "ryan con", "ryan con"], 3)
solution(["con", "ryan"], ["ryan con", "ryan con", "con ryan", "ryan con", "con ryan", "con ryan"], 3)