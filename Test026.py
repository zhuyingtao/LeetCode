__author__ = 'zyt'

class Solution:
    # @param {integer[]} nums
    # @return {integer}
    def removeDuplicates(self, nums):
        if len(nums) < 2:
            return len(nums)
        next = 1
        for i in range(1, len(nums)):
            if nums[i] != nums[i - 1]:
                nums[next] = nums[i]
                next += 1
        return next
