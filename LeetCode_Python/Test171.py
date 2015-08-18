from functools import reduce

__author__ = 'zyt'

class Solution:
    # @param {string} s
    # @return {integer}
    def titleToNumber(self, s):
        # total = 0
        # for i in range(len(s) - 1, -1, -1):
        #     total += (ord(s[i]) - ord('A') + 1) * math.pow(26, (len(s) - 1 - i))
        # return int(total)

        # wonderful code using reduce and lambda
        return reduce(lambda x, y: x * 26 + y, [ord(c) - 64 for c in s])

# print(Solution().titleToNumber("ZBC"))
