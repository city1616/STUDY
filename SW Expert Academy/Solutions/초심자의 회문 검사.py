T = int(input())

for test_case in range(1, T + 1) :
    s = input()
    value = 0
    if s == "".join(reversed(s)) :
        value = 1
    
    print("#" + str(test_case), value)
