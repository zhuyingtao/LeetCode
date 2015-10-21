__author__ = 'zyt'


class Solution:
    # @param {integer} x
    # @return {boolean}
    def isPalindrome(self, x):
        if x < 0: return False
        s = str(x)
        for i in range(len(s)):
            print(s[i] + " " + s[-i - 1])
            if s[i] != s[-i - 1]:
                return False
            if i >= len(s) / 2:
                return True


print(Solution().isPalindrome(2083993802))
