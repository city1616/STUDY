# boj.kr/1302
# 1302. 베스트셀러

import sys

input = sys.stdin.readline

book = dict()
candi = []

for _ in range(int(input())) :
    title = input().rstrip()
    if title in book :
        book[title] += 1
    else :
        book[title] = 1

print(book)

for key, val in book.items() :
    if val == max(book.values()):
        candi.append(key)

print(sorted(candi)[0])