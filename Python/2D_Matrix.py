matrix = [
    [1, 2, 3, 4, 5],
    [6, 7, 8, 9, 10],
    [11, 12, 13, 14, 15],
    [16, 17, 18, 19, 20]
]

target = 5


def bSearch(row, cStart, cEnd):
    s = cStart
    e = cEnd
    while s <= e:
        mid = int((s + e) / 2)

        if matrix[row][mid] == target:
            return [row, mid]
        elif matrix[row][mid] > target:
            e = mid - 1
        else:
            s = mid + 1

    return [-1, -1]


def findMatrix():
    row = len(matrix) - 1
    col = len(matrix[row]) - 1
    ans = [-1, -1]
    if row == 0:
        ans = bSearch(row, 0, col)
    else:
        cMid = int(col / 2)
        rStart = 0
        rEnd = row

        while rStart < rEnd - 1:
            rMid = int((rStart + rEnd) / 2)

            if matrix[rMid][cMid] == target:
                ans = [rMid, cMid]
                return ans
            elif matrix[rMid][cMid] > target:
                rEnd = rMid
            else:
                rStart = rMid

        if matrix[rStart][cMid - 1] >= target:
            ans = bSearch(rStart, 0, cMid - 1)

        if matrix[rStart][cMid + 1] <= target <= matrix[rStart][col]:
            ans = bSearch(rStart, cMid + 1, col)

        if matrix[rEnd][cMid - 1] >= target:
            ans = bSearch(rEnd, 0, cMid - 1)

        if matrix[rEnd][cMid + 1] <= target <= matrix[rEnd][col]:
            ans = bSearch(rEnd, cMid + 1, col)

        return ans


print(findMatrix())
