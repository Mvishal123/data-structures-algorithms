def findMissing(ls):
    N = len(ls)
    ans = []

    for i in range(N):
        while ls[i] != i + 1:
            if ls[i] == i + 1 or ls[ls[i] - 1] == ls[i]:
                break
            ls[i], ls[ls[i] - 1] = ls[ls[i] - 1], ls[i]

    for i in range(N):
        if ls[i] != i + 1:
            ans.append(i + 1)
    return ans


nums = [2, 2, 3, 3, 5, 6]
print(findMissing(nums))
