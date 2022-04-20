from collections import deque

def solution(bridge_length, weight, truck_weights) :
    answer = 0
    moving = deque()
    end = deque()
    for truck_weight in truck_weights :
        if sum(moving) >= weight :
            moving.append(truck_weight)
            answer += 1

    return answer

solution(2, 10, [7, 4, 5, 6])
# solution(100, 100, [10])
# solution(100, 100, [10,10,10,10,10,10,10,10,10,10])