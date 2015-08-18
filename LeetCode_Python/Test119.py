__author__ = 'zyt'

class Solution:
    # @param {integer} rowIndex
    # @return {integer[]}
    def getRow(self, rowIndex):
        result = [1] * (rowIndex + 1)
        for i in range(1, rowIndex + 1):
            for j in range(i - 1, 0, -1):
                result[j] += result[j - 1]
        return result

print(Solution().getRow(3))
