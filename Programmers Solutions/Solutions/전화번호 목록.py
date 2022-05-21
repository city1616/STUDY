def solution(phone_book) :

    phone_book = sorted(phone_book, key = lambda x : len(x)) # 길이 순서대로 정렬
    print("phone_book :", phone_book)

    for i in range(len(phone_book)) :
        for j in range(i + 1, len(phone_book)) :

            if len(phone_book[i]) == len(phone_book[j]) :
                continue
            elif phone_book[i] == phone_book[j][: len(phone_book[i])] :
                return False

    return True

solution(["119", "97674223", "1195524421"]) # false
# solution(["123","456","789"]) # true
# solution(["12","123","1235","567","88"]) # false 