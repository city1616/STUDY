N = int(input())
result = ""
chk = False
cnt = 0

for i in range(1, N + 1) :
    num_str = str(i)
    for c in num_str :
        if int(c) % 3 == 0 and int(c) != 0 :
            chk = True
            cnt += 1
    if chk :
        result += "-" * cnt
        chk = False
        cnt = 0
    else :
        result += num_str

    result += " "

print(result)