# 각 유저는 한 번에 한 명의 유저를 신고할 수 있습니다.
# 신고 횟수에 제한은 없습니다. 서로 다른 유저를 계속해서 신고할 수 있습니다.
# 한 유저를 여러 번 신고할 수도 있지만, 동일한 유저에 대한 신고 횟수는 1회로 처리됩니다.
# k번 이상 신고된 유저는 게시판 이용이 정지되며, 해당 유저를 신고한 모든 유저에게 정지 사실을 메일로 발송합니다.
# 유저가 신고한 모든 내용을 취합하여 마지막에 한꺼번에 게시판 이용 정지를 시키면서 정지 메일을 발송합니다.

def solution(id_list, report, k) :
    w = []
    answer = []
    cnt = 0
    id_l = dict(zip(id_list, [0 for i in range(len(id_list))])) # id별 신고받은 횟수
    id_a = dict(zip(id_list, [0 for i in range(len(id_list))])) # id별 이메일 받을 횟수
    # id_a = {i : 0 for i in id_list}
    print(id_l)
 
    for i in set(report) : # id별 신고받은 횟수
        print(i)
        fir_id, sec_id = i.split()
        id_l[sec_id] += 1
    
    print(id_l)

    for key, value in id_l.items() : # 정지된 아이디
        if value >= k :
            w.append(key)
    print(w)

    for i in set(report) : # id별 이메일 받을 횟수
        fir_id, sec_id = i.split()
        if sec_id in w :
            id_a[fir_id] += 1

    for i in id_a.values() :
        answer.append(i)
    print(answer)
    return answer

solution(["muzi", "frodo", "apeach", "neo"], ["muzi frodo","apeach frodo","frodo neo","muzi neo","apeach muzi"], 2)
solution(["con", "ryan"], ["ryan con", "ryan con", "ryan con", "ryan con"], 3)
solution(["con", "ryan"], ["ryan con", "ryan con", "con ryan", "ryan con", "con ryan", "con ryan"], 3)