import sys

__author__ = 'zyt'


class Solution:
    # @param {integer} x
    # @return {integer}
    def reverse(self, x):
        y = (-1 if x < 0 else 1) * int(str(abs(x))[::-1])
        return y if abs(y) <= sys.maxsize else 0


print(Solution().reverse(1534236469))
