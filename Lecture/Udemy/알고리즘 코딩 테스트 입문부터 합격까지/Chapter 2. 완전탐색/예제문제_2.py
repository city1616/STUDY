# boj.kr/2309
# 2309. 일곱 난쟁이

# Solution 1

from itertools import combinations

w = []
for _ in range(9) :
    w.append(int(input()))

for i in combinations(w, 7) :
    if sum(i) == 100 :
        for j in sorted(i) :
            print(j)
        break

# Solution 2

from itertools import combinations

heights = [int(input()) for _ in range(9)]
for combi in combinations(heights, 7) :
    if sum(combi) == 100 :
        for height in sorted(combi) :
            print(height)
        break

# Solution 3
heights = [int(input()) for _ in range(9)]
heights.sort()
total = sum(heights)

def f() :
    for i in range(8) :
        for j in range(i + 1, 9) :
            if total - heights[i] - heights[j] == 100 :
                for k in range(9) :
                    if i != k and j != k :
                        print(heights[k])
                return

f()