# Dynamic programming
# Memoization
def fact(number, ls):
    if number == 0 or number == 1:
        return number
    ls[0] = 0
    ls[1] = 1
    for i in range(2, number+1):
        ls[i] = ls[i-2] + ls[i-1]

    return ls[number]


ls = [-1]
number = 10
ans = fact(number, ls*(number+1))
print(ans)
