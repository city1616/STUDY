T = int(input())

for test_case in range(1, T + 1) :
    num1, num2 = map(int, input().split())
    if num1 == num2 :
        opt = "="
    elif num1 > num2 :
        opt = ">"
    elif num1 < num2 :
        opt = "<"
    
    print("#" + str(test_case), opt)