__author__ = 'zyt'


class Solution:
    # @param {string} s
    # @return {integer}
    def lengthOfLastWord(self, s):
        # if not s:
        #     return 0
        # try:
        #     index = s.rindex(" ")
        # except ValueError:
        #     index = -1
        # return len(s[index + 1:])
        return len(s.strip().split(' ')[-1])


print(Solution().lengthOfLastWord("    "))
