def findALlDuplicates(nums):
    def swap(arr, f, s):
        temp = arr[f]
        arr[f] = arr[s]
        arr[s] = temp

    ans = set()
    for i in range(len(nums)):
        while nums[i] != i + 1:
            if nums[i] == nums[nums[i] - 1] and nums[i] not in ans:
                ans.add(nums[i])
                break
            else:
                if nums[i] == nums[nums[i] - 1] == nums[i]:
                    break
                else:
                    swap(nums, i, nums[i] - 1)
    return list(ans)


ls = [4, 3, 2, 7, 8, 2, 3, 1]
print(findALlDuplicates(ls))
