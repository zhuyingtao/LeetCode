__author__ = 'zyt'

class Solution:
    # @param {integer[]} nums
    # @return {boolean}
    def containsDuplicate(self, nums):
        # temp = set([])
        # for i in nums:
        #     if (temp.__contains__(i)):
        #         return True
        #     else:
        #         temp.add(i)
        # return False

        # best solution
        return len(nums)>len(set(nums))

print(Solution().containsDuplicate([1, 2, 3, 3]))
