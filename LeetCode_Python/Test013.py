__author__ = 'zyt'


class Solution:
    # @param {string} s
    # @return {integer}
    def romanToInt(self, s):
        dict = {"M": 1000, 'D': 500, 'C': 100, 'L': 50, 'X': 10, 'V': 5, 'I': 1}
        preVal = total = 0
        for i in range(len(s) - 1, -1, -1):
            val = dict[s[i]]
            if val < preVal:
                total -= val
            else:
                total += val
            preVal = val
        return total


print(Solution().romanToInt("MCXXXIV"))
