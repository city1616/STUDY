def solution(nums):
    cnt = len(nums) // 2

    if len(set(nums)) >= cnt :
        return cnt
    else :
        return len(set(nums))

s = [3,1,2,3]
print(solution(s))

a = [3,3,3,2,2,4]
print(solution(a))

b = [3,3,3,2,2,2]
print(solution(b))