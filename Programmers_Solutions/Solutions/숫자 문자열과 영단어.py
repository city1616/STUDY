import re

def solution(s) :
    answer = s
    answer = re.sub("zero", "0", answer)
    answer = re.sub("one", "1", answer)
    answer = re.sub("two", "2", answer)
    answer = re.sub("three", "3", answer)
    answer = re.sub("four", "4", answer)
    answer = re.sub("five", "5", answer)
    answer = re.sub("six", "6", answer)
    answer = re.sub("seven", "7", answer)
    answer = re.sub("eight", "8", answer)
    answer = re.sub("nine", "9", answer)

    # answer = answer.replace("zero", "0")
    # answer = answer.replace("one", "1")
    # answer = answer.replace("two", "2")
    # answer = answer.replace("three", "3")
    # answer = answer.replace("four", "4")
    # answer = answer.replace("five", "5")
    # answer = answer.replace("six", "6")
    # answer = answer.replace("seven", "7")
    # answer = answer.replace("eight", "8")
    # answer = answer.replace("nine", "9")

    print(answer)

    return answer

s = "one4seveneight"
c = "23four5six7"
a = "2three45sixseven"
b = "123"

solution(s)
solution(c)
solution(a)
solution(b)