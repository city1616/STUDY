# 순열 permutation
# 모든 경우의 수를 순서대로 살펴볼 때 용이하다
# 삼성에서 next_permutation 활용하면 쉽게 풀리는 문제들이 많이 나왔다고 한다.

from itertools import permutations

v = [0, 1, 2, 3]

for i in permutations(v, 2) :
    print(i)

# 조합 combination
# 파이썬은 combination까지 기본으로 제공

from itertools import combinations

v = [0, 1, 2, 3]

for i in combinations(v, 2) :
    print(i)