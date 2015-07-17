from functools import reduce

__author__ = 'zyt'


class Solution:
    # @param {integer[]} nums
    # @return {integer}
    def singleNumber(self, nums):
        return reduce(lambda x, y: x ^ y, nums)

# print(Solution().singleNumber([1,2,3,2,1]))
