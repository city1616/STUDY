from collections import deque

def solution(prices) :
    q = deque()
    e = deque()
    result = []
    # q.append(price for price in prices)
    for price in prices :
        q.append(price)
    
    print("q :", q)

    for _ in range(len(q)) :
        tmp = q.pop()
        if not e :
            result.append(0)
        else :
            cnt = 0
            for i in range(len(e)) :
                if tmp <= e[i] :
                    cnt += 1
            result.append(cnt)
        e.append(tmp)
    result = list(reversed(result))
    print("q :", q)
    print("e :", e)
    print("result :", result)
    return result

solution([1, 2, 3, 2, 3])