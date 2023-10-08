
def swap(ls, f, s):
    temp = ls[f]
    ls[f] = ls[s]
    ls[s] = temp
def findDuplicate(nums):
    for i in range(len(nums)):
        while nums[i] != i + 1:
            if nums[i] == i + 1:
                break
            if nums[i] == nums[nums[i] - 1]:
                return nums[i]
            else:
                swap(nums, i, nums[i] - 1)

ls = [1, 1]
print(findDuplicate(ls))
