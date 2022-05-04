def solution(A, B) :
    answer = 0
    A = sorted(A)
    B = sorted(B, reverse = True)

    print("A :", A)
    print("B :", B)

    for i in range(len(A)) :
        answer += A[i] * B[i]
    print("answer :", answer)
    # answer = sum(a * b for a, b in zip(sorted(A), sorted(B, reverse = True)))
    return answer

solution([1, 4, 2], [5, 4, 4]) # answer : 29
solution([1, 2], [3, 4]) # answer : 10

