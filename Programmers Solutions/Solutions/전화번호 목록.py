def solution(phone_book) :

    phone_book = sorted(phone_book)
    print("phone_book :", phone_book)

    for i in range(len(phone_book) - 1) :
        print(phone_book[i], phone_book[i + 1][ : len(phone_book[i])])
        if phone_book[i] == phone_book[i + 1][: len(phone_book[i])] :
            print(False)
            return False
    print(True)
    return True

solution(["119", "97674223", "1195524421"]) # false
# solution(["123","456","789"]) # true
# solution(["12","123","1235","567","88"]) # false 