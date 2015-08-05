__author__ = 'zyt'


class Solution:
    # @param {integer[]} nums
    # @return {integer}
    def rob(self, nums):
        if not nums:
            return 0
        if len(nums) == 1:
            return nums[0]
        # not rob house[0]
        pre1 = cru1 = 0
        for i in range(1, len(nums)):
            temp = pre1
            pre1 = cru1
            cru1 = max(nums[i] + temp, cru1)
        # not rob house[n-1]
        pre2 = cru2 = 0
        for i in range(0, len(nums) - 1):
            temp = pre2
            pre2 = cru2
            cru2 = max(nums[i] + temp, cru2)
        return max(cru1, cru2)
