__author__ = 'zyt'

class Solution:
    # @param {integer[]} nums
    # @return {integer}
    def rob(self, nums):
        value = [0] * len(nums)
        for i in range(len(nums)):
            if i == 0:
                value[i] = nums[i]
            elif i == 1:
                value[i] = max(nums[i], value[i - 1])
            else:
                value[i] = max(value[i - 2] + nums[i], value[i - 1])
        return value[-1] if nums else 0

print(Solution().rob([]))
