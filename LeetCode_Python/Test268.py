__author__ = 'zyt'


class Solution(object):
    def missingNumber(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        return sum(range(len(nums) + 1)) - sum(nums)


print(Solution().missingNumber([0, 1, 3]))
