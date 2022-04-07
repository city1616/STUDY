# boj.kr/11286
# 11286. 절대값 힙

import heapq as hq
import sys

# Solution 1

input = sys.stdin.readline # 빠른 입출력
pq = []

for _ in range(int(input())) :
    x = int(input())
    if x :
        hq.heappush(pq, (abs(x), x))
    else :
        print(hq.heappop(pq)[1] if pq else 0)
        # if pq :
        #     print(hq.heappop(pq))
        # else :
        #     print(0)

# Solution 2

input = sys.stdin.readline # 빠른 입출력

min_heap = [] # 양수
max_heap = [] # 음수
for _ in range(int(input())) :
    x = int(input())
    if x :
        if x > 0 :
            hq.heappush(min_heap, x)
        else :
            hq.heappush(max_heap, -x)
    else :
        if min_heap :
            if max_heap:
                if min_heap[0] < max_heap[0] :
                    print(hq.heappop(min_heap))
                else :
                    print(-hq.heappop(max_heap))
            else :
                print(hq.heappop(min_heap))
        else :
            if max_heap:
                print(-hq.heappop(max_heap))
            else :
                print(0)