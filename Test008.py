__author__ = 'zyt'

class Solution:
    # @param {string} str
    # @return {integer}
    def myAtoi(self, str):
        str = str.strip()
        if len(str) == 0:
            return 0
        MAX_INT = 2147483647
        MIN_INT = -2147483648
        sum = 0
        if str[0] == '-':
            sign, i = -1, 1
        elif str[0] == '+':
            sign, i = 1, 1
        else:
            sign, i = 1, 0
        while i < len(str) and str[i] >= '0' and str[i] <= '9':
            if sum > MAX_INT // 10 or (sum == MAX_INT // 10 and int(str[i]) > MAX_INT % 10):
                return MAX_INT if sign > 0 else MIN_INT
            sum = sum * 10 + int(str[i])
            i += 1
        return sum * sign

print(Solution().myAtoi('2147483648'))
