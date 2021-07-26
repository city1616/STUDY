def sol(num):
	if num < 10:
		return num
	return (num % 10) + sol(num // 10)

def sol2(num):
	return sum(int(i) for i in str(num))

def sol3(num):
	return sum(map(int, str(num)))

print(sol(123))
print(sol(1234))
print("*******")
print(sol2(123))
print(sol2(1234))
print("*******")
print(sol3(123))
print(sol3(1234))