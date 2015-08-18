from _collections_abc import Iterable

__author__ = 'zyt'


class Solution:
    # @param {integer[]} digits
    # @return {integer[]}
    def plusOne(self, digits):
        return list(map(int,str(int("".join(map(str,digits)))+1)))


print(Solution().plusOne([1, 2]))
