from math import gcd

def solution(arr) :
    answer = 0

    def lcm(x, y) :
        return x * y // gcd(x, y)
    while True :
        arr.append(lcm(arr.pop(), arr.pop()))
        if len(arr) == 1 :
            print(arr[0])
            return arr[0]

    return answer

a = [2, 6, 8, 14] # 168
b = [1, 2, 3] # 6

solution(a)
# solution(b)