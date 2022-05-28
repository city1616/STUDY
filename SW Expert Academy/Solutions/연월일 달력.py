T = int(input())
date_standard = {"01" : 31, "02" : 28, "03" : 31, "04" : 30, "05" : 31, "06" : 30, "07" : 31, "08" : 31, "09" : 30, "10" : 31, "11" : 30, "12" : 31}

for test_case in range(1, T + 1) :
    date = input()

    year = date[: 4]
    month = date[4 : 6]
    day = date[6 :]

    if int(month) < 1 or int(month) > 12 :
        date = -1
    elif int(day) < 1 or int(day) > date_standard[month] :
        date = -1
    else :
        date = year + "/" + month + "/" + day
    print("#" + str(test_case), date)