__author__ = 'zyt'

class Solution:
    # @param {string} s
    # @return {boolean}
    def isValid(self, s):
        stack = []
        dict = {'}': '{', ']': '[', ')': '('}
        for i in s:
            if i in dict.values():
                stack.append(i)
            elif i in dict.keys():
                if not stack or dict[i] != stack.pop():
                    return False
        return len(stack) == 0
