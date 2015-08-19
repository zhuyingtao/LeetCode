__author__ = 'zyt'


class Solution:
    # @param {integer} num
    # @return {integer}
    def addDigits(self, num):
        if not num:
            return 0
        return num % 9 if num % 9 else 9
