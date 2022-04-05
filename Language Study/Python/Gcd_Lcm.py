def gcd(a, b) :
	while(b != 0) :
		r = a % b
		a = b
		b = r
		print("1. " , a)
		print("2. " , b)
		print("3. " , r)
	return a

def lcm(a, b) :				# a = G * x , b = G * y , 최대공약수 = G , 최소공배수 = L = G * x * y = G * x * G * y / G = G * x * y
	return a * b / gcd(a, b)


print(gcd(3, 12))
print(lcm(3, 12))
print(gcd(2, 5))
print(lcm(2, 5))