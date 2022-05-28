T = int(input())

for test_case in range(1, T + 1) :
    number = list(map(int, input().split()))
    number.remove(max(number))
    number.remove(min(number))
    avg = round(sum(number) / 8)
    print("#" + str(test_case), avg)