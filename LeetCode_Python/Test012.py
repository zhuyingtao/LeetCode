__author__ = 'zyt'


class Solution:
    # @param {integer} num
    # @return {string}
    def intToRoman(self, num):
        roman = [['', 'D', 'L', 'V'], ['M', 'C', 'X', 'I']]
        s = str(num).zfill(4)
        result = ""
        for i in range(0, len(s)):
            if 5 <= int(s[i]) < 9:
                result += (roman[0][i] + roman[1][i] * (int(s[i]) - 5))
            elif 0 <= int(s[i]) < 4:
                result += (roman[1][i] * (int(s[i])))
            elif s[i] == '4':
                result += (roman[1][i] + roman[0][i])
            elif s[i] == '9':
                result += (roman[1][i] + roman[1][i - 1])
        return str(result)


print(Solution().intToRoman(123))
