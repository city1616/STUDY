# boj.kr/2164
# 2164. 카드2
from collections import deque

N = int(input())

q = deque() # q = deque(range(1, N + 1))
for i in range(1, N + 1) :
    q.append(i)

print(q)

# q.popleft()
# q.append(q.popleft())

while len(q) > 1 :
    q.popleft()
    front = q.popleft()
    q.append(front)

print(q[0])

arr = [*range(1, N + 1)]
print(arr)