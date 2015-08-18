__author__ = 'zyt'

class Solution:
    # @param {integer} n
    # @return {string}
    def convertToTitle(self, n):
        s = []
        while n > 0:
            n -= 1
            s += chr(n % 26 + ord('A'))
            n //= 26
        s.reverse()
        return "".join(s)

print(Solution().convertToTitle(1))
