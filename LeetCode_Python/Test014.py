__author__ = 'zyt'


class Solution:
    # @param {string[]} strs
    # @return {string}
    def longestCommonPrefix(self, strs):
        if not strs:  return ""
        prefix = ""
        stand = strs[0]
        for i in range(len(stand)):
            for str in strs:
                if i >= len(str) or str[i] != stand[i]:
                    return prefix
            prefix += stand[i]
        return prefix


print(Solution().longestCommonPrefix(['abc', 'ab', 'c']))
