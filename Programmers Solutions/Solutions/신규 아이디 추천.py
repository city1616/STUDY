# 1단계 new_id의 모든 대문자를 대응되는 소문자로 치환합니다. 
#   -> string.upper(), string.lower()
#   -> ascii
#   -> A ~ Z : 65 ~ 90
#   -> a ~ z : 97 ~ 122
#   -> ord() : 문자열을 ascii로 변환 ex) ord("a") -> 97
#   -> chr() : ascii를 문자열로 변환 ex) chr(90) -> Z
# 2단계 new_id에서 알파벳 소문자, 숫자, 빼기(-), 밑줄(_), 마침표(.)를 제외한 모든 문자를 제거합니다.
#   -> string.replace("검색문자", "치환문자", 치환횟수)
#   -> 정규 표현식 문자열 치환
#       -> import re
#       -> text = "I like apble And abple"
#       -> text_mod = re.sub("apble|abple", "apple", text)
#       -> print(text_mod) -> I like apple And apple
# 3단계 new_id에서 마침표(.)가 2번 이상 연속된 부분을 하나의 마침표(.)로 치환합니다.
# 4단계 new_id에서 마침표(.)가 처음이나 끝에 위치한다면 제거합니다.
# 5단계 new_id가 빈 문자열이라면, new_id에 "a"를 대입합니다.
# 6단계 new_id의 길이가 16자 이상이면, new_id의 첫 15개의 문자를 제외한 나머지 문자들을 모두 제거합니다.
#      만약 제거 후 마침표(.)가 new_id의 끝에 위치한다면 끝에 위치한 마침표(.) 문자를 제거합니다.
# 7단계 new_id의 길이가 2자 이하라면, new_id의 마지막 문자를 new_id의 길이가 3이 될 때까지 반복해서 끝에 붙입니다.

def solution(new_id) :
    
    answer = ""
    temp = ""

    word = [chr(i) for i in range(97, 123)]
    for i in range(10) :
        word.append(str(i))
        if i == 9 :
            word.append("-")
            word.append("_")
            word.append(".")
    print(word)

    new_id = new_id.lower() # 소문자로 치환
    print("1단계 new_id :", new_id)

    for c in new_id :
        if c in word :
            temp += c
    new_id = temp
    print("2단계 new_id :", new_id)

    while new_id != new_id.replace("..", "."):
        new_id = new_id.replace("..", ".")
    print("3단계 new_id :", new_id)

    # if new_id[0] == "." :
    #     new_id = new_id[1:]
    # if new_id[len(new_id) - 1] == "." :
    #     new_id = new_id[:-1]
    # new_id.strip(".")
    while new_id[0] == "." :
        if len(new_id) == 1 :
            new_id = "aaa"
            print(new_id)
            return new_id
        else :
            new_id = new_id[1:]

    while new_id[len(new_id) - 1] == "." :
        new_id = new_id[:-1]
    print("4단계 new_id :", new_id)

    if new_id == "" :
        new_id += "a"
    print("5단계 new_id :", new_id)

    if len(new_id) >= 16 :
        new_id = new_id[:15]
    
    if new_id[0] == "." :
        new_id = new_id[1:]

    if new_id[len(new_id) - 1] == "." :
        new_id = new_id[:-1]
    print("6단계 new_id :", new_id)

    # if len(new_id) == 2 :
    #     new_id += new_id[0]
    # elif len(new_id) == 1 :
    #     new_id *= 3
    # else :
    #     print("문자열의 길이가 3 이상")
    
    while len(new_id) < 3 :
        new_id += new_id[len(new_id) - 1]

    print("7단계 new_id :", new_id)
    return answer

# a = ""
# a += "b"
# print(a)
# test = [chr(i) for i in range(97, 123)]
# for i in range(10) :
#     test.append(i)
#     if i == 9 :
#         test.append("-")
#         test.append("_")
#         test.append(".")
# print(test)
# solution("a")

# test = "abc"
# print(test[:2])
# print(len(test))
# print(len(test[:2]))
solution("...!@BaT#*..y.abcdefghijklm")
solution("z-+.^.")
solution("=.=")
solution("123_.def")
solution("abcdefghijklmn.p")
solution("=........a...a...")