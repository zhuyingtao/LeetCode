from functools import reduce
import operator

__author__ = 'zyt'


class Solution(object):
    def singleNumber(self, nums):
        """
        :type nums: List[int]
        :rtype: List[int]
        """
        result = reduce(operator.xor, nums)
        result &= -result
        num1 = num2 = 0
        for num in nums:
            if num & result:
                num1 ^= num
            else:
                num2 ^= num
        return [num1, num2]


print(Solution().singleNumber([1, 2, 1, 3, 2, 5]))
