# 다른 사람 풀이
# re.sub(정규표현식, 대상문자열, 치환 문자)
# text = "I like apble And abple"
# text_mod = re.sub("apble|abple", "apple", text)
# print(text_mod) -> I like apple And apple

import re

def solution(new_id) :
    st = new_id
    st = st.lower()
    st = re.sub("[^a-z0-9\-_.]", "", st) # 문자열 치환
    st = re.sub("\.+", ".", st)
    st = re.sub("(^\.|\.$)", "", st)
    st = "a" if len(st) == 0 else st[:15]
    st = re.sub("(^\.|\.$)", "", st)
    st = st if len(st) > 2 else st + "".join([st[-1] for i in range(3 - len(st))])
    return st

print(solution("...!@BaT#*..y.abcdefghijklm"))
print(solution("z-+.^."))
print(solution("=.="))
print(solution("123_.def"))
print(solution("abcdefghijklmn.p"))
print(solution("=........a...a..."))
print(solution("..."))