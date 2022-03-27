def solution(sizes) :

    width = []
    height = []

    for i in sizes :
        print(sorted(i))
        width.append(sorted(i)[0])
        height.append(sorted(i)[1])

    w = max(width)
    h = max(height)

    answer = w * h
    print("width :", w, "height :", h, "answer :", answer)
    return answer

a = [[60, 50], [30, 70], [60, 30], [80, 40]]
b = [[10, 7], [12, 3], [8, 15], [14, 7], [5, 15]]
c = [[14, 4], [19, 6], [6, 16], [18, 7], [7, 11]]

solution(a)
solution(b)
solution(c)