def solution(price, money, count) :
    total_price = 0
    for i in range(1, count + 1) :
        total_price += price * i

    print("total_price :", total_price, "money :", money)

    if total_price <= money :
        return 0
    else :
        return total_price - money


a = 3
b = 20
c = 4

print(solution(a, b, c))

a = 2
b = 30
c = 4

print(solution(a, b, c))

3 * 5 * 4 // 2 - 20