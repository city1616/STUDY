import math

def solution(numbers, hand) :
    answer = ""
    l_hand = "*"
    r_hand = "#"
    phone_dist = {1 : [0, 0], 2 : [0, 1], 3 : [0, 2], 4 : [1, 0], 5 : [1, 1], 6 : [1, 2], 
                7 : [2, 0], 8 : [2, 1], 9 : [2, 2], "*" : [3, 0], 0 : [3, 1], "#" : [3, 2]}

    for num in numbers :
        if num == 1 or num == 4 or num == 7 :
            answer += "L"
            l_hand = num
        elif num == 3 or num == 6 or num == 9 :
            answer += "R"
            r_hand = num
        else :
            l_dist = math.dist(phone_dist[num], phone_dist[l_hand])
            r_dist = math.dist(phone_dist[num], phone_dist[r_hand])

            if l_dist == math.sqrt(2) :
                l_dist = 2
            elif l_dist == math.sqrt(5) :
                l_dist = 3
            elif l_dist == math.sqrt(10) :
                l_dist = 5
            else :
                pass
            
            if r_dist == math.sqrt(2) :
                r_dist = 2
            elif r_dist == math.sqrt(5) :
                r_dist = 3
            elif r_dist == math.sqrt(10) :
                r_dist = 5
            else :
                pass

            if l_dist == r_dist :
                if hand == "right" :
                    answer += "R"
                    r_hand = num
                elif hand == "left" :
                    answer += "L"
                    l_hand = num
            elif l_dist < r_dist :
                answer += "L"
                l_hand = num
            elif l_dist > r_dist :
                answer += "R"
                r_hand = num
        print("l_hand :", l_hand, "r_hand :", r_hand, "answer :", answer)
    print(answer)
    return answer

a = [1, 3, 4, 5, 8, 2, 1, 4, 5, 9, 5]
b = "right"
solution(a, b)

a = [7, 0, 8, 2, 8, 3, 1, 5, 7, 6, 2]
b = "left"
solution(a, b)

a = [1, 2, 3, 4, 5, 6, 7, 8, 9, 0]
b = "right"
solution(a, b)

a = [0, 0, 0, 0, 0, 0]
b = "right"
solution(a, b)

a = [0, 0, 0, 0, 0, 0]
b = "left"
solution(a, b)

a = [0, 0, 9, 0, 0, 0]
b = "right"
solution(a, b)

a = [0, 0, 9, 0, 0, 0]
b = "left"
solution(a, b)

a = [1, 3, 2, 3, 1, 5]
b = "right"
solution(a, b)

a = [2, 8, 9, 1]
b = "right"
solution(a, b)
# answer = ""
#     l_hand = 10
#     r_hand = 12
#     number = []

# for i in numbers :
#     if i == 0 :
#         number.append(11)
#     else :
#         number.append(i)

# for num in number :
#     if num == 1 or num == 4 or num == 7 :
#         answer += "L"
#         l_hand = num
#     elif num == 3 or num == 6 or num == 9 :
#         answer += "R"
#         r_hand = num
#     else : # 2, 5, 8, 0
#         if abs(num - l_hand) == abs(num - r_hand) or abs(l_hand - r_hand) == 2 :
#             if hand == "right" :
#                 answer += "R"
#                 r_hand = num
#             else :
#                 answer += "L"
#                 l_hand = num
#         elif abs(num - l_hand) < abs(num - r_hand) :
#             if abs(num - r_hand) == 3 :
#                 answer += "R"
#                 r_hand = num
#             else :
#                 answer += "L"
#                 l_hand = num
#         elif abs(num - l_hand) > abs(num - r_hand) :
#             if abs(num - l_hand) == 3 :
#                 answer += "L"
#                 l_hand = num
#             else :
#                 answer += "R"
#                 r_hand = num
#     print("l_hand :", l_hand, "r_hand :", r_hand, "answer :", answer)

# print(answer)