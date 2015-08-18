__author__ = 'zyt'


class Solution:
    # @param {string} s
    # @param {integer} numRows
    # @return {string}
    def convert(self, s, numRows):
        lines = []
        for i in range(numRows):
            lines.append([])
        i = 0
        while i < len(s):
            for line in lines:
                if i >= len(s): break
                line += s[i]
                i += 1
            for line in lines[-2:0:-1]:
                if i >= len(s): break
                line += s[i]
                i += 1
        return "".join(list(map("".join, lines)))


print(Solution().convert("ABCD", 2))
