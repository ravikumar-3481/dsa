def mostwater(height : list) :
    left = 0
    right = len(height) - 1
    maxwater = 0

    while (left < right) :
        width = right - left
        ht = min(height[left], height[right])
        currwater = width * ht
        maxwater = max(maxwater, currwater)

        if height[left] < height[right]:
            left += 1
        else:
            right -=1

    return maxwater

height = [1,8,6,2,5,4,8,3,7]
result = mostwater(height)
print(result)