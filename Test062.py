__author__ = 'zyt'


class Solution:
    # @param {integer} m
    # @param {integer} n
    # @return {integer}
    def uniquePaths(self, m, n):
        path = [[0] * n for row in range(m)]
        for i in range(m):
            for j in range(n):
                if i == 0 or j == 0:
                    path[i][j] = 1
                else:
                    path[i][j] = path[i - 1][j] + path[i][j - 1]
        return path[m - 1][n - 1]


print(Solution().uniquePaths(3, 7))
