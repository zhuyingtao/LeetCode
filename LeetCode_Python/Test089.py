__author__ = 'zyt'


class Solution:
    # @param {integer} n
    # @return {integer[]}
    def grayCode(self, n):
        list = [0]
        for i in range(n):
            inc = 1 << i
            for num in list[::-1]:
                list.append(num + inc)
        return list

print(Solution().grayCode(2))
