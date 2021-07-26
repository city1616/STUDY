def make_max(number, k) :
	num = list(map(int, str(number)))
	num.sort()
	com = list()
	answer = list()
	for i in range(k) :
		com.append(num[i])
	num = list(map(int, str(number)))
	for i in range(k) :
		for j in range(len(num)) :
			if num[j] == com[i] :
				num.remove(num[j])
				break

	for i in range(len(num)) :
		answer.append(str(num[i]))
	result = "".join(answer)

	return result

print(make_max(1234, 1))
print(make_max(1924, 2))
print(make_max(1231234, 3))
print(make_max(4177252841, 4))