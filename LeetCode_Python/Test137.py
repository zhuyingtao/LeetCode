__author__ = 'zyt'

class Solution:
    # @param {integer[]} nums
    # @return {integer}
    def singleNumber(self, nums):
        dict = {}
        for i in nums:
            if i not in dict:
                dict[i] = 1
            else:
                dict[i] += 1
        for k in dict:
            if dict[k]==1:
                return k

print(Solution().singleNumber([1,2,2,3,3,3,4,4]))