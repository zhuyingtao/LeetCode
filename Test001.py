__author__ = 'zyt'


class Solution:
    # @param {integer[]} nums
    # @param {integer} target
    # @return {integer[]}
    def twoSum(self, nums, target):
        dict = {}
        for i in range(len(nums)):
            diff = target - nums[i]
            if diff in dict:
                return [dict[diff] + 1, i + 1]
            else:
                dict[nums[i]] = i


print(Solution().twoSum([0, 4, 3, 0], 0))
