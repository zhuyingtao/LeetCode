import re

__author__ = 'zyt'

class Solution:
    # @param {string} s
    # @return {boolean}
    def isPalindrome(self, s):
        s = re.sub(r'\W', '', s.lower())
        # s = list(filter(str.isalpha, s.lower()))
        return s == s[::-1]

print(Solution().isPalindrome('A man, a plan, a canal: Panama'))
