# 입력 형식
# "점수|보너스|[옵션]"으로 이루어진 문자열 3세트.
# 예) 1S2D*3T
# 점수는 0에서 10 사이의 정수이다.
# 보너스는 S, D, T 중 하나이다.
# 옵선은 *이나 # 중 하나이며, 없을 수도 있다.

# 출력 형식
# 3번의 기회에서 얻은 점수 합계에 해당하는 정수값을 출력한다.
# 예) 37

# dartResult = "1S2D*3T"
dartResult = "1D2S3T*"
print("dartResult :", dartResult)

num = ["1", "2", "3", "4", "5", "6", "7", "8", "9", "10"]
bonus = ["S", "D", "T"]
opt = ["*", "#"]
dart = list(dartResult)

first = []
second = []
third = []

temp_1 = []
temp_2 = []
temp_3 = []

idx_opt = []
idx_sdt = []

for idx, val in enumerate(dart) :
    if val == "*" :
        idx_opt.append(idx)
    elif val == "#" :
        idx_opt.append(idx)

for idx, val in enumerate(dart) :
    if val == "S" :
        idx_sdt.append(idx)
    elif val == "D" :
        idx_sdt.append(idx)
    elif val == "T" :
        idx_sdt.append(idx)
        
print("index option :", idx_opt)
print("index STD :", idx_sdt)

if len(idx_opt) == 3 :
    for i in range(len(dart)) :
        first.append(dart[i])
        if dart[i] in opt :
            break
    for i in range(len(first), len(dart)) :
        second.append(dart[i])
        if dart[i] in opt :
            break
    for i in range(len(first) + len(second), len(dart)) :
        third.append(dart[i])

elif len(idx_opt) == 2 :
    for i in range(len(dart)) :
        temp_1.append(dart[i])
        if dart[i] in opt :
            break
    for i in range(len(temp_1), len(dart)) :
        temp_2.append(dart[i])
        if dart[i] in opt :
            break
    if len(temp_1) <= 4 and len(temp_2) <= 4 :
        for i in range(len(temp_1) + len(temp_2), len(dart)) :
            third.append(dart[i])
        first = temp_1.copy()
        second = temp_2.copy()
    else :
        if len(temp_1) <= 4 :
            first = temp_1.copy()
            for i in range(len(first), len(dart)) :
                second.append(dart[i])
                if dart[i] in bonus :
                    break
            for i in range(len(first) + len(second), len(dart)) :
                third.append(dart[i])
        else :
            for i in range(len(temp_1)) :
                first.append(dart[i])
                if dart[i] in bonus :
                    break
            for i in range(len(first), len(temp_1)) :
                second.append(dart[i])
            third = temp_2.copy()

elif len(idx_opt) == 1 :
    for i in range(len(dart)) :
        temp_1.append(dart[i])
        if dart[i] in opt :
            break
    if len(temp_1) == len(dart) :
        for i in range(len(dart)) :
            first.append(dart[i])
            if dart[i] in bonus :
                break
        for i in range(len(first), len(dart)) :
            second.append(dart[i])
            if dart[i] in bonus :
                break
        for i in range(len(first) + len(second), len(dart)) :
            third.append(dart[i])
    else :
        for i in range(len(temp_1), len(dart)) :
            temp_2.append(dart[i])
        if len(temp_1) >= 4 :
            for i in range(len(temp_1)) :
                first.append(dart[i])
                if dart[i] in bonus :
                    break
            for i in range(len(first), len(temp_1)) :
                second.append(dart[i])
            third = temp_2.copy()
        else :
            first = temp_1.copy()
            for i in range(len(temp_1), len(dart)) :
                second.append(dart[i])
                if dart[i] in bonus :
                    break
            for i in range(len(first) + len(second), len(dart)) :
                third.append(dart[i])

elif len(idx_opt) == 0 :
    for i in range(len(dart)) :
        first.append(dart[i])
        if dart[i] in bonus :
            break
    for i in range(len(first), len(dart)) :
        second.append(dart[i])
        if dart[i] in bonus :
            break
    for i in range(len(first) + len(second), len(dart)) :
        third.append(dart[i])

else :
    print("해당 사항 없음")

print(first)
print(second)
print(third)

first_score = 0
second_score = 0
third_score = 0

if len(first) == 4 :
    first_score = 10
    if first[2] == "S" :
        first_score = first_score
    elif first[2] == "D" :
        first_score = first_score * first_score
    elif first[2] == "T" :
        first_score = first_score * first_score * first_score
    else :
        print("SDT ERROR")
    if first[3] == "*" :
        first_score *= 2
    elif first[3] == "#" :
        first_score *= -1
    else :
        print("OPTION ERROR")
elif len(first) == 3 :
    if first[1] == "0" :
        first_score = 10
        if first[2] == "S" :
            first_score = first_score
        elif first[2] == "D" :
            first_score = first_score * first_score
        elif first[2] == "T" :
            first_score = first_score * first_score * first_score
        else :
            print("SDT ERROR")
    else :
        first_score = int(first[0])
        if first[1] == "S" :
            first_score = first_score
        elif first[1] == "D" :
            first_score = first_score * first_score
        elif first[1] == "T" :
            first_score = first_score * first_score * first_score
        else :
            print("SDT ERROR")
        if first[2] == "*" :
            first_score *= 2
        elif first[2] == "#" :
            first_score *= -1
        else :
            print("OPTION ERROR")
elif len(first) == 2 :
    first_score = int(first[0])
    if first[1] == "S" :
        first_score = first_score
    elif first[1] == "D" :
        first_score = first_score * first_score
    elif first[1] == "T" :
        first_score = first_score * first_score * first_score
    else :
        print("SDT ERROR")

if len(second) == 4 :
    second_score = 10
    if second[2] == "S" :
        second_score = second_score
    elif second[2] == "D" :
        second_score = second_score * second_score
    elif second[2] == "T" :
        second_score = second_score * second_score * second_score
    else :
        print("SDT ERROR")
    if second[3] == "*" :
        first_score *= 2
        second_score *= 2
    elif second[3] == "#" :
        second_score *= -1
    else :
        print("OPTION ERROR")
elif len(second) == 3 :
    if second[1] == "0" :
        second_score = 10
        if second[2] == "S" :
            second_score = second_score
        elif second[2] == "D" :
            second_score = second_score * second_score
        elif second[2] == "T" :
            second_score = second_score * second_score * second_score
        else :
            print("SDT ERROR")
    else :
        second_score = int(second[0])
        if second[1] == "S" :
            second_score = second_score
        elif second[1] == "D" :
            second_score = second_score * second_score
        elif second[1] == "T" :
            second_score = second_score * second_score * second_score
        else :
            print("SDT ERROR")
        if second[2] == "*" :
            first_score *= 2
            second_score *= 2
        elif second[2] == "#" :
            second_score *= -1
        else :
            print("OPTION ERROR")
elif len(second) == 2 :
    second_score = int(second[0])
    if second[1] == "S" :
        second_score = second_score
    elif second[1] == "D" :
        second_score = second_score * second_score
    elif second[1] == "T" :
        second_score = second_score * second_score * second_score
    else :
        print("SDT ERROR")

if len(third) == 4 :
    third_score = 10
    if third[2] == "S" :
        third_score = third_score
    elif third[2] == "D" :
        third_score = third_score * third_score
    elif third[2] == "T" :
        third_score = third_score * third_score * third_score
    else :
        print("SDT ERROR")
    if third[3] == "*" :
        second_score *= 2
        third_score *= 2
    elif third[3] == "#" :
        third_score *= -1
    else :
        print("OPTION ERROR")
elif len(third) == 3 :
    if third[1] == "0" :
        third_score = 10
        if third[2] == "S" :
            third_score = third_score
        elif third[2] == "D" :
            third_score = third_score * third_score
        elif third[2] == "T" :
            third_score = third_score * third_score * third_score
        else :
            print("SDT ERROR")
    else :
        third_score = int(third[0])
        if third[1] == "S" :
            third_score = third_score
        elif third[1] == "D" :
            third_score = third_score * third_score
        elif third[1] == "T" :
            third_score = third_score * third_score * third_score
        else :
            print("SDT ERROR")
        if third[2] == "*" :
            second_score *= 2
            third_score *= 2
        elif third[2] == "#" :
            third_score *= -1
        else :
            print("OPTION ERROR")
elif len(third) == 2 :
    third_score = int(third[0])
    if third[1] == "S" :
        third_score = third_score
    elif third[1] == "D" :
        third_score = third_score * third_score
    elif third[1] == "T" :
        third_score = third_score * third_score * third_score
    else :
        print("SDT ERROR")

print("first score :", first_score)
print("second score :", second_score)
print("third score :", third_score)

answer = first_score + second_score + third_score
print("answer :", answer)