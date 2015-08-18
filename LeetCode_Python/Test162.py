__author__ = 'zyt'


class Solution:
    # @param nums, an integer[]
    # @return an integer
    def findPeakElement(self, nums):
        if len(nums) == 1:
            return 0
        return self.binarySearch(nums, 0, len(nums) - 1)

    def binarySearch(self, nums, low, high):
        if low <= high:
            mid = (low + high) // 2
            if mid == 0 and nums[mid] > nums[mid + 1]:
                return mid
            elif mid == len(nums) - 1 and nums[mid] > nums[mid - 1]:
                return mid
            elif nums[mid - 1] < nums[mid] > nums[mid + 1]:
                return mid
            else:
                i1 = self.binarySearch(nums, low, mid - 1)
                i2 = self.binarySearch(nums, mid + 1, high)
                if i1:
                    return i1
                if i2:
                    return i2
        return 0


print(Solution().findPeakElement([1,2,1]))
