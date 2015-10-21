import decimal
import math

__author__ = 'zyt'


class Solution(object):
    def nthUglyNumber(self, n):
        """
        :type n: int
        :rtype: int
        """
        uglyList = [1]
        index2, index3, index5 = 0, 0, 0
        while len(uglyList) < n:
            uglyList.append(min(uglyList[index2] * 2, uglyList[index3] * 3, uglyList[index5] * 5))
            while uglyList[index2] * 2 <= uglyList[-1]:
                index2 += 1
            while uglyList[index3] * 3 <= uglyList[-1]:
                index3 += 1
            while uglyList[index5] * 5 <= uglyList[-1]:
                index5 += 1
        return uglyList[-1]


decimal.getcontext().prec = 1000
print(decimal.Decimal(2).sqrt())
print("%.1000f" % math.sqrt(2))

# print(Solution().nthUglyNumber(10))
