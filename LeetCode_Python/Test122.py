__author__ = 'zyt'

class Solution:
    # @param {integer[]} prices
    # @return {integer}
    def maxProfit(self, prices):
        total = 0
        for i in range(0, len(prices) - 1):
            if prices[i + 1] > prices[i]:
                total += prices[i + 1] - prices[i]
        return total
