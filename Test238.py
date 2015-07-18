__author__ = 'zyt'

class Solution:
    # @param {integer[]} nums
    # @return {integer[]}
    def productExceptSelf(self, nums):
        res = [1] * len(nums)
        # store the left product
        left = nums[0]
        for i in range(1, len(nums)):
            res[i] = left
            left *= nums[i]

        # store the right product and multiply with the left
        right = 1
        for i in range(len(nums) - 1, -1, -1):
            res[i] = res[i] * right
            right *= nums[i]

        return res

# print(Solution().productExceptSelf([3]))
