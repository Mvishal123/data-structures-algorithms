# Bubble sort
def swap(ls, first, second):
    temp = ls[first]
    ls[first] = ls[second]
    ls[second] = temp


def bubbleSort(ls):
    lenLs = len(ls)
    for i in range(lenLs - 1):
        swapped = False
        for j in range(len(ls) - 1 - i):
            if ls[j] > ls[j + 1]:
                swap(ls, j, j + 1)
                swapped = True
        if not swapped:
            break

    return ls


def selectionSort(ls):
    for i in range(1, len(ls) - 1):
        maxEle = 0
        for j in range(1, len(ls) + 1 - i):
            if ls[j] > ls[maxEle]:
                maxEle = j
        swap(ls, maxEle, len(ls) - i)
    return ls


def insertionSort(ls):
    for i in range(len(ls) - 1):
        for j in range(i + 1, 0, -1):
            if ls[j] < ls[j - 1]:
                swap(ls, j, j - 1)
            else:
                break
    return ls


def cyclicSort(ls):
    for i in range(len(ls)):
        swapIndex = ls[i] - 1
        if not swapIndex == i:
            swap(ls, i, swapIndex)
    return ls


_list = [4, 3, 2, 1, 5]

# print(bubbleSort(_list))
# print(selectionSort(_list))
# print(insertionSort(_list))
print(cyclicSort(_list))
