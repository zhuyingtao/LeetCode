from itertools import permutations

__author__ = 'zyt'


class Solution:
    # @param {integer[]} nums
    # @return {integer[][]}
    def permute(self, nums):
        return list(permutations(nums))


print(Solution().permute([1, 2, 3]))
