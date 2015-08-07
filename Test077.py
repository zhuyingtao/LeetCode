from itertools import combinations

__author__ = 'zyt'

class Solution:
    # @param {integer} n
    # @param {integer} k
    # @return {integer[][]}
    def combine(self, n, k):
        return list(combinations([x for x in range(1,n+1)],k))

print(Solution().combine(4,2))