
def sol(s):
	tmp = s.split()
	result = ""
	for i in range(len(tmp)):
		for j in range(len(tmp[i])):
			if j % 2 == 0:
				result += tmp[i][j].upper()
			else:
				result += tmp[i][j].lower()
		if i != len(tmp) - 1:
			result += " "
	return result
def sol1(s):
	tmp = list()
	a = ""
	result = ""
	'''
	for i in range(len(s) - 1):
		a += s[i]
		if s[i + 1] == " ":
			tmp.append(a)
			a = ""
	'''

	for i in range(len(s) - 1):
		if s[i] == " ":
			a += s[i]
			if s[i + 1].isalpha():
				tmp.append(a)
				a = ""
		elif s[i].isalpha():
			a += s[i]
			if s[i + 1] == " ":
				tmp.append(a)
				a = ""
		else:
			a += s[i]
			tmp.append(a)
		if i + 1 == len(s) - 1:
			a += s[i + 1]
			tmp.append(a)

	print(tmp)

	for i in range(len(tmp)):
		for j in range(len(tmp[i])):
			if j % 2 == 0:
				result += tmp[i][j].upper()
			else:
				result += tmp[i][j].lower()
	return result

def toWeirdCase(s):
    return " ".join(map(lambda x: "".join([a.lower() if i % 2 else a.upper() for i, a in enumerate(x)]), s.split(" ")))


s = "try hello world"
s1 = "sp ace"
s2 = "apple   apple"
s3 = "  apple  apple  "
print(sol(s))
print(sol(s1))
print(sol(s2))
print(sol(s3))

print("*****************")

print(sol1(s))
print(sol1(s1))
print(sol1(s2))
print(sol1(s3))
print(toWeirdCase(s))
