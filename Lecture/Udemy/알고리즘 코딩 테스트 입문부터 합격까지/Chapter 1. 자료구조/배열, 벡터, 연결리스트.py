# 배열 Array
# - 삽입 / 삭제 : O(N)
# - 탐색 : O(1) -> random access(임의 접근)
# - C++에서는 size 변경 불가
# - Python은 리스트를 사용

# 벡터 Vector
# - 삽입 / 삭제 : O(N)
# - 탐색 : O(1)
# - 동적 배열(size 변경 가능)

# 연결 리스트 Linked List
# - 삽입 / 삭제 : O(1)
# - 탐색 : O(N)
# - PS에서는 별로 안쓰이지만
# - 다른 자료구조들을 구현할 때 많이 쓰인다.

# 스택 Stack
# FILO(선입후출) / LIFO(후입선출)
# - 삽입 / 삭제 : O(1)
# - Python : 리스트로 구현
# - 웹 브라우저에서 뒤로가기 구현 가능

# 큐 Queue
# FIFO / LILO
# 삽입 / 삭제 : O(1)
# from queue import Queue : thread-safe -> 속도가 느리다
# from collections import deque -> 속도가 빠르지만 멀티쓰레드에서 안전하지 않다.
from collections import deque

dq = deque()
dq.append(123)
dq.appendleft(456)
dq.appendleft(789)
print(dq)

print(dq.pop())
print(dq.popleft())

# 우선순위 큐 Priority Queue(Heap)
# - 삽입 / 삭제 : O(log N)
# - C++ : max-heap 기본제공
# - Python : min-heap 기본제공
# from queue import PriorityQueue
import heapq
pq = []
heapq.heappush(pq, 456)
heapq.heappush(pq, 123)
heapq.heappush(pq, 789)
print("size :", len(pq))
while len(pq) > 0 :
    print(heapq.heappop(pq))

# Dictionary
# - C++ : 맵 Map -> red-black tree
# - Python -> hash
# - 삽입 / 삭제 : C++ -> O(log N), Python -> O(1)
# - Key, Value
# - Key : 중복 불가능
# - Value : 중복 가능

# 집합 Set
# - 중복되지 않음
# 삽입 / 삭제 : C++ -> O(log N), Python -> O(1)
s = set()
s.add(1)
s.add(456)
s.add(456)
s.add(789)
print(s)
s.remove(1)
print(s)