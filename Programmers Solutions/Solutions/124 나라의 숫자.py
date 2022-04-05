# solution = lambda n : (solution(i) if (i := (n - 1) // 3) else "") + "124"[(n - 1) % 3]

# def solution(n) :
#     length = 1
#     total = 0
#     num = ["1", "2", "4"]
#     answer = ""
#     while True :
#         total += 3 ** length
#         if n <= total :
#             break 
#         length += 1
#     print("total :", total, "length :", length)

#     print(length - 1, "~", length)
#     print(total - (3 ** length), "~", total)

#     for i in range(total - (3 ** length) + 1, total + 1) :
#         # if i == 0 :
#         #     continue
#         # print(i)
#         if i == n :
#             break

#     cnt = n - (total - (3 ** length))
#     print(cnt, "번째")

#     for i in range(length) :
#         n -= 1
#         if i == 0 :
#             answer += num[(n % 3)]
#         else :
#             answer += num[(n % 3)]
#         n //= 3
#     print("answer :", answer)
#     return 0

def solution(n) :
    answer = ""
    num = ["1", "2", "4"]

    while n > 0 :
        n -= 1
        answer += num[n % 3]

        n //= 3
    print("answer :", answer)
    
    return answer

solution(39)
solution(40)