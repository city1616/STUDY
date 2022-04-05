def solution(nums) :
    num_set = set(nums)
    num_list = []
    prime_number = []

    for i in range(len(num_set)) :
        for j in range(i + 1, len(num_set)) :
            for k in range(j + 1, len(num_set)) :
                num_list.append([nums[i], nums[j], nums[k]])
    
    for i in num_list :
        print(i)
        for j in range(2, sum(i)) :
            if sum(i) % j == 0 :
                break
            if j == sum(i) - 1 :
                prime_number.append(sum(i))
    
    print(prime_number)
    answer = len(prime_number)
    print(answer)
    return answer


a = [1, 2, 3, 4]
b = [1, 2, 7, 6, 4]

solution(a)
solution(b)