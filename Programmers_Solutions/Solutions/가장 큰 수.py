def solution(numbers) :
    answer = ""
    total = 0
    tmp = []

    for num in numbers :
        c = (str(num) * 4)[:4]
        print(c)
        length = len(str(num))
        tmp.append((c, length))
    print(tmp)
    tmp = sorted(tmp, reverse = True)
    print(tmp)
    for (c, length) in tmp :
        total += int(c)
        if total == 0 :
            return "0"
        answer += c[:length]
    print("answer :", answer)
    return answer

a = [6, 10, 2]        # 6210
b = [3, 30, 34, 5, 9] # 9534330
c = [40, 30, 9, 12]   # 9403012
d = [300, 30, 10]
e = [0, 101, 11, 1, 100, 0]
f = [0, 0, 0]
g = [978, 97]
h = [110, 101, 11, 1]
k = [1, 10, 100, 1000]

# solution(a)
# solution(b)
# solution(d)
# solution(e)
solution(g)

