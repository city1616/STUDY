T = int(input())

for test_case in range(1, T + 1) :
    s = input()

    for i in range(1, 11) :
        if s[0 : i] * (30 // i) + s[:30 % i] == s :
            print("#" + str(test_case), i)
            break

# T = int(input())
# for test_case in range(T):
#     data = input()
#     count = 0
#     for i in range(1, len(data)):
#         ans = data[0:i]
#         answer = len(ans)
#         if data[answer : 2 * answer] == ans:
#             count = answer
#             break
#     print("#{} {}".format(test_case+1, count))