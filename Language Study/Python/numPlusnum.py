def numPlus(x, n) :
	answer = list()
	a = 0

	for i in range(n):
		a += x
		answer.append(a)

	return answer

print(numPlus(2, 5))

'''
def number_generator(x, n):
    # 함수를 완성하세요
    return [i * x + x for i in range(n)]
print(number_generator(2, 5))
'''