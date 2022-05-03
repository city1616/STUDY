import heapq

def solution(scoville, K) :
    hq = []
    cnt = 0
    list_length = len(scoville)
    for i in scoville :
        heapq.heappush(hq, i)
    while hq[0] < K :
        heapq.heappush(hq, heapq.heappop(hq) + (heapq.heappop(hq) * 2))
        cnt += 1
        if len(hq) == 1 :
            break
    print("count :", cnt)
    print("hq :", hq)
    if hq[0] < K :
        return -1
    else :
        return cnt
    

solution([1, 2, 3, 9, 10, 12], 7) # 2
solution([1, 1, 1], 3)