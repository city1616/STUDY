import heapq

def solution(scoville, K) :
    hq = []
    cnt = 0
    for i in scoville :
        heapq.heappush(hq, i)
    while hq[0] < K :
        heapq.heappush(hq, heapq.heappop(hq) + (heapq.heappop(hq) * 2))
        cnt += 1
    print("count :", cnt)
    print("hq :", hq)
    return cnt

solution([1, 2, 3, 9, 10, 12], 7) # 2