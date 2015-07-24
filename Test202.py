__author__ = 'zyt'

class Solution:
    # @param {integer} n
    # @return {boolean}
    def isHappy(self, n):
        mem = set()
        while n != 1:
            n = sum([int(i) ** 2 for i in str(n)])
            if n in mem:
                return False
            else:
                mem.add(n)
        else:
            return True

print(Solution().isHappy(99))
