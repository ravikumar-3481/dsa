class solution :
    def findmedian(self, nums1 : list[int] , nums2 : list[int]) -> float :
        merged = nums1 + nums2
        merged.sort()
        n = len(merged)
        
        if n % 2 == 1:
            print("odd")
            return float(merged[n//2])
        else:
            print("even")
            middle2 = float(merged[n//2])
            middle1 = float(merged[n//2-1])
            return (middle1 + middle2) / 2.0


    def findmedian2(self, nums1 : list[int] , nums2 : list[int]) -> float :
        import random as rd
        nums = nums1 + nums2
        n = len(nums)

        def quickselect(k):
            left , right = 0, n - 1
            while left <= right:

                pivot_idx = rd.randint(left, right)
                nums[pivot_idx], nums[right] = nums[right], nums[pivot_idx]
                pivot, store = nums[right] , left

                for i in range(left , right) :
                    if nums[i] < pivot:
                        nums[i], nums[store] = nums[store] , nums[i]
                        store += 1

                nums[store], nums[right] = nums[right] , nums[store]

                if store == k:
                    return nums[store]

                if store < k :
                    left = store + 1
                else :
                    right = store - 1

        if n % 2 == 1 :
            return float(quickselect(n//2))

        left = float(quickselect(n//2-1))
        right = float(quickselect(n//2))

        return (left + right) / 2.0        
        








so = solution()
nums1 = [1, 7, 5]
nums2 = [2, 1, 3]

print(so.findmedian(nums1, nums2))
print(so.findmedian2(nums1, nums2))
