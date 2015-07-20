__author__ = 'zyt'

class Solution:
    # @param {integer} n
    # @return {integer}
    def climbStairs(self, n):
        # if n == 0 or n == 1:
        #     return 1
        # else:
        #     return self.climbStairs(n - 1) + self.climbStairs(n - 2)

        ways = []
        for i in range(n + 1):
            if i == 0 or i == 1:
                ways.append(1)
            else:
                ways.append(ways[i - 1] + ways[i - 2])
        return ways[n]

print(Solution().climbStairs(4))
