from itertools import permutations
import math

def solution(numbers) :
    
    num = [i for i in numbers]
    # print(num)
    total = set()
    prime = set()
    for i in range(1, len(num) + 1) :
        for combi in permutations(num, i) :
            total.add(int("".join(combi)))
    
    # for n in total :
    #     for i in range(2, int(math.sqrt(n)) + 1) :
    #         if n % i == 0 :
    #             break
    #         prime.add(n)
    
    # 에라토스테네스의 체
    def is_prime_number(n) :
        array = [True for _ in range(n + 1)]
        for i in range(2, int(math.sqrt(n)) + 1) :
            j = 2
            while i * j <= n :
                array[i * j] = False
                j += 1
        return [i for i in range(2, n + 1) if array[i]]
    cnt = 0
    for i in total :
        if i in is_prime_number(max(total)) :
            cnt += 1

    # print(total)
    # print(sorted(prime))
    # print("length :", len(prime))
    print("cnt :", cnt)
    return cnt

# solution("17")
# solution("011")
solution("1231")