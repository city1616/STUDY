

'''
s = ["abcd", "a", "john"]
s1 = ["abc", "b", "c", "a"]

for i in range(len(s)):
	print(i)

for i in range(len(s1)):
	print(i)
'''
'''
str = "applewatch"
print(str[1:5])
print(str[2:3])
print(str[3:4])
'''
s = ["Jane", "Kim"]
print("Kim is {}".format(s.index("Kim")))

s = [1, 2, 3, 4]

for i in range(len(s)):
	print(i)

date = ["sun", "mon", "tue", "wed", "thu", "tri", "sat"]
date.sort()
print(date)

str = "sssssdd"
tmp = str.split()
print(tmp)
print(type(str.count("s")))

b = "a"  # ASCII
print(ord(b))

s = "a123"
s1 = list()
for i in range(len(s)):
	s1.append(s[i])

for i in range(len(s1)):
	print(type(s1[i]))
	print(s1[i])
	print(ord(s1[i]))

def sumDivisor(num):
    # num / 2 의 수들만 검사하면 성능 약 2배 향상잼
    return num + sum([i for i in range(1, (num // 2) + 1) if num % i == 0])
print(sumDivisor(12))

def test(n):
	return sum([i for i in range(1, n + 1) if i % 2 == 0])
print(test(2))
print(test(10))