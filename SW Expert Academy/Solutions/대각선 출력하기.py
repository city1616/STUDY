# print("#++++")
# print("+#+++")
# print("++#++")
# print("+++#+")
# print("++++#")

for i in range(5) :
    text = ""
    for j in range(5) :
        if j == i :
            text += "#"
        else :
            text += "+"
    print(text)