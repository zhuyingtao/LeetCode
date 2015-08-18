__author__ = 'zyt'


class Solution:
    # @param {string} s
    # @param {string} t
    # @return {boolean}
    def isAnagram(self, s, t):
        # dictS = {}
        # for char in s:
        #     if char not in dictS:
        #         dictS[char] = 1
        #     else:
        #         dictS[char] += 1
        # for char in t:
        #     if char not in dictS:
        #         return False
        #     dictS[char] -= 1
        # for i in dictS:
        #     if dictS[i] != 0:
        #         return False
        # return True

        return sorted(s)==sorted(t)


