__author__ = 'zyt'

class Solution:
    # @param {integer} n
    # @return {boolean}
    def isPowerOfTwo(self, n):
        return n > 0 and len([i for i in bin(n) if i == '1']) == 1

print(Solution().isPowerOfTwo(9))
