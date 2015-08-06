__author__ = 'zyt'


class Solution:
    # @param {integer[][]} grid
    # @return {integer}
    def minPathSum(self, grid):
        m, n = len(grid), len(grid[0])
        cost = grid[:]
        for i in range(1, n):
            cost[0][i] += cost[0][i - 1]
        for i in range(1, m):
            cost[i][0] += cost[i - 1][0]
        for i in range(1, m):
            for j in range(1, n):
                cost[i][j] += min(cost[i - 1][j], cost[i][j - 1])
        return cost[m - 1][n - 1]
