from collections import deque

def solution(prices) :
    answer = []
    for i in range(len(prices) - 1) :
        time = len(prices) - i - 1
        for j in range(i + 1, len(prices)) :
            if prices[i] > prices[j] :
                time = j - i
                break
        answer.append(time)
    answer.append(0)
    print("answer :", answer)
    return answer

solution([1, 2, 3, 2, 3])

# Solution 2

def solution(prices) :
    answer = [0] * len(prices)
    print(answer)
    for i in range(len(prices)) :
        for j in range(i + 1, len(prices)) :
            if prices[i] <= prices[j] :
                answer[i] += 1
            else :
                answer [i] += 1
                break
    print("answer :", answer)
    return answer

solution([1, 2, 3, 2, 3])