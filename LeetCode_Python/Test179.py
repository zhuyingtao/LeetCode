__author__ = 'zyt'


class Solution:
    # @param {integer[]} nums
    # @return {string}
    def largestNumber(self, nums):
        return sorted(map(str, nums), reverse=True)


print(Solution().largestNumber([1, 2, 9, 21, 4]))
