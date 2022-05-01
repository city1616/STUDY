def solution(n) :
    one_cnt = list(map(int, bin(n)[2 : ])).count(1)
    while True :
        n += 1
        if list(map(int, bin(n)[2 : ])).count(1) == one_cnt :
            print("n :", n)
            answer = n
            break
    
    return answer


solution(78) # 83
solution(15) # 23