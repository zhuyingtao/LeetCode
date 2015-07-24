__author__ = 'zyt'

class Solution:
    # @param {integer[]} nums
    # @param {integer} k
    # @return {void} Do not return anything, modify nums in-place instead.
    def rotate(self, nums, k):
        for i in range(k):
            nums.insert(0,nums[-1])
            nums.pop(-1)
            # nums.remove(nums[-1]) // remove the first goal

Solution().rotate([1, 2], 1)
