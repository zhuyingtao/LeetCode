__author__ = 'zyt'

class Solution:
    # @param {integer} n
    # @return {integer}
    def trailingZeroes(self, n):
        return 0 if n // 5 == 0 else n // 5 + self.trailingZeroes(n // 5)

print(Solution().trailingZeroes(10))
