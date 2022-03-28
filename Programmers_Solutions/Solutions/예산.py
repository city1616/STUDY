def solution(d, budget) :
    price = sorted(d)
    total = 0
    sum_price = 0
    print(price)

    for i in price :
        total += 1
        sum_price += i
        if budget - sum_price < 0 :
            total -= 1
            break
    print(total)
    return total

a = [1, 3, 2, 5, 4]
b = 9
solution(a, b)

a = [2, 2, 3, 3]
b = 10
solution(a, b)