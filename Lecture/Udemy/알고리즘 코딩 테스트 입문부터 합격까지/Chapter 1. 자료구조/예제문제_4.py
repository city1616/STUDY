# boj.kr/1302
# 1302. 베스트셀러

import sys

input = sys.stdin.readline

title = dict()
t = []

for _ in range(int(input())) :
    s = input().rstrip()
    if s in title :
        title[s] += 1
    else :
        title[s] = 1

print(title)
for key, val in title.items() :
    if val == max(title.values()):
        t.append(key)

print(sorted(t)[0])