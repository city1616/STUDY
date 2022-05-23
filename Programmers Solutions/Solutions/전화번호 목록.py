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

# def solution(phone_book):
#     # 정렬
#     phone_book.sort(key=len)
#     hash_table = {}

#     # 맨 처음 가장 짧은 길이를 저장. min.
#     min_len = len(phone_book[0])

#     for target in phone_book:
#         # loop마다 본인 정보를 hash table에 저장.
#         hash_table[hash(target)] = target
#         # min길이부터 +1씩 해서 본인 길이까지 hash table에서 검색.
#         # 있으면 false, 없으면 true-계속 진행.
#         for i in range(min_len,len(target)):
#             try:
#                 if hash_table[hash(target[0:i])]:
#                     return False
#             except KeyError:
#                 print('key error')
#                 # 아무 동작 안 해도 됨.

#     return True

# def solution(phoneBook):
#     phoneBook = sorted(phoneBook)

#     for p1, p2 in zip(phoneBook, phoneBook[1:]):
#         if p2.startswith(p1):
#             return False
#     return True
