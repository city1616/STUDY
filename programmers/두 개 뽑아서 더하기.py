# 정수 배열 numbers가 주어집니다. 
# numbers에서 서로 다른 인덱스에 있는 두 개의 수를 뽑아 더해서 만들 수 있는 모든 수를 배열에 오름차순으로 담아 return 하도록 solution 함수를 완성해주세요.

# [2,1,3,4,1]
# 2 = 1 + 1 입니다. (1이 numbers에 두 개 있습니다.)
# 3 = 2 + 1 입니다.
# 4 = 1 + 3 입니다.
# 5 = 1 + 4 = 2 + 3 입니다.
# 6 = 2 + 4 입니다.
# 7 = 3 + 4 입니다.
# 따라서 [2,3,4,5,6,7] 을 return 해야 합니다.

# list 정렬
# reverse : 리스트를 거꾸로 뒤집는다. 
# sort : 정렬, 기본값은 오름차순 정렬, reverse 옵션 True는 내림차순 정렬 ex) a.sort(), a.sort(reverse = True)
# sorted : 순서대로 정렬, 정렬된 리스트를 반환 ex) y = sorted(x)
# reversed : 거꾸로 뒤집기 ex) y = reversed(x)

def solution(numbers):
    
    answer = []
    num_sum = []

    for i in range(len(numbers)) :
        for j in range(len(numbers)) :
            if i != j :
                num_sum.append(numbers[i] + numbers[j])

    # sort_num_sum = sorted(num_sum)
    num_sum.sort()
    # print(sort_num_sum)
    print(num_sum)

    for number in num_sum :
        if number not in answer :
            answer.append(number)

    print(answer)
    return answer

solution([2, 1, 3, 4, 1])
solution([5,0,2,7])

# 다른 사람 풀이
# def solution(numbers):
#     answer = []
#     for i in range(len(numbers)):
#         for j in range(i+1, len(numbers)):
#             answer.append(numbers[i] + numbers[j])
#     return sorted(list(set(answer)))