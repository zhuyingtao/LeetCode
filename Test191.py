__author__ = 'zyt'

class Solution:
    # @param n, an integer
    # @return an integer
    def hammingWeight(self, n):
        count = 0
        for i in bin(n):
            if i == '1':
                count += 1
        return count

print(Solution().hammingWeight(10))
