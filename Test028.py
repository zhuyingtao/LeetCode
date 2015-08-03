__author__ = 'zyt'


class Solution:
    # @param {string} haystack
    # @param {string} needle
    # @return {integer}
    def strStr(self, haystack, needle):
        if not needle:
            return 0
        ni = hi = 0
        start = 0
        while hi < len(haystack):
            if needle[ni] == haystack[hi]:
                ni += 1
                hi += 1
            else:
                ni = 0
                start = hi = start + 1
            if ni == len(needle):
                return start
        return -1


print(Solution().strStr("mississippi", "issip"))
