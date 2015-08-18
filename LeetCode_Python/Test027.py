__author__ = 'zyt'

class Solution:
    # @param {integer[]} nums
    # @param {integer} val
    # @return {integer}
    def removeElement(self, nums, val):
        # these two styles are not same! one is in place, another is a new array.
        nums[:] = [x for x in nums if x != val]
        # nums = [x for x in nums if x != val]
        return nums

print(Solution().removeElement([4, 5, 4, 4, 4], 4))
