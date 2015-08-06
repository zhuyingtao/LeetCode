__author__ = 'zyt'


class Solution:
    # @param {integer[]} nums
    # @return {integer}
    def findMin(self, nums):
        if len(nums) == 1:
            return nums[0]
        result = self._findMin(nums, 0, len(nums) - 1)
        if result == None:
            return nums[0]
        else:
            return result

    def _findMin(self, nums, low, high):
        if low <= high:
            mid = (low + high) // 2
            if mid + 1 < len(nums) and nums[mid] > nums[mid + 1]:
                return nums[mid + 1]
            else:
                left = self._findMin(nums, low, mid - 1)
                right = self._findMin(nums, mid + 1, high)
                if left != None:
                    return left
                if right != None:
                    return right


print(Solution().findMin([9, 0, 2, 7, 8]))
