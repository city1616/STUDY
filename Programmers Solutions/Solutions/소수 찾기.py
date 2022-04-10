from itertools import permutations
import math

def solution(numbers) :
    
    num = [i for i in numbers]
    print("num :", num)
    total = []
    prime = set()
    for i in range(1, len(num) + 1) :
        for permu in permutations(num, i) :
            total.append(int("".join(permu)))
    total = sorted(total)
    print("total :", total)
    total_set = set(total)
    print("total_set :", total_set)
    print("total_set length :", len(total_set))
    
    # 에라토스테네스의 체
    # def is_prime_number(n) :
    #     array = [True for _ in range(n + 1)]
    #     for i in range(2, int(math.sqrt(n)) + 1) :
    #         j = 2
    #         while i * j <= n :
    #             array[i * j] = False
    #             j += 1
    #     return [i for i in range(2, n + 1) if array[i]]

    # cnt = 0
    # for i in total_set :
    #     if i in is_prime_number(max(total_set)) :
    #         cnt += 1

     # 소수
    def primenum(num) :
        for i in range(2, int(math.sqrt(num)) + 1) :
            if num % i == 0 :
                return False
        return True
    cnt = 0
    tmp = []
    for n in total_set :
        if n == 0 or n == 1 :
            continue

        if primenum(n) :
            tmp.append(n)
            cnt += 1
        
    # print(total)
    # print(sorted(prime))
    # print("length :", len(prime))
    print("tmp :", tmp)
    print("cnt :", cnt)
    return cnt

solution("17")
# solution("011")
# solution("1231")

# Solution 2

from itertools import permutations

def solution(n) :
    a = set()

    for i in range(len(n)) :
        a |= set(map(int, map("".join, permutations(list(n), i + 1))))
    a -= set(range(0, 2))

    for i in range(2, int(max(a) ** 0.5) + 1) :
        a -= set(range(i * 2, max(a) + 1, i))
    return len(a)