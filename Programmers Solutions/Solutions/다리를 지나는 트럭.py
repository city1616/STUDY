from collections import deque

# Solution 1
def solution(bridge_length, weight, truck_weights) :
    i = 0
    cnt = 1
    moving = deque()
    z = deque([0 for _ in range(bridge_length)])
    sum_weight = 0
    
    while True :
        if i == len(truck_weights) :
            moving.appendleft(0)
        elif weight - sum_weight >= truck_weights[i] :
            moving.appendleft(truck_weights[i])
            sum_weight += truck_weights[i]
            i += 1
        else :
            moving.appendleft(0)

        # print("cnt :", cnt, "moving :", moving, "z :", z)
        if moving == z :
            break
        
        if len(moving) == bridge_length :
            sum_weight -= moving.pop()

        cnt += 1
    
    print("answer :", cnt)
    
    return cnt

# Solution 2
def solution(bridge_length, weight, truck_weights) :
    truck_weights = deque(truck_weights)
    bridge = deque([0 for _ in range(bridge_length)])
    time = 0
    bridge_weight = 0

    while bridge :
        bridge_weight -= bridge.popleft()
        time += 1
        if truck_weights :
            if bridge_weight + truck_weights[0] <= weight :
                left = truck_weights.popleft()
                bridge_weight += left
                bridge.append(left)
            else :
                bridge.append(0)
    
    return time

solution(2, 10, [7, 4, 5, 6])  
solution(100, 100, [10]) 
solution(100, 100, [10,10,10,10,10,10,10,10,10,10])