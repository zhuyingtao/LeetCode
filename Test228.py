__author__ = 'zyt'

class Solution:
    # @param {integer[]} nums
    # @return {string[]}
    def summaryRanges(self, nums):
        result = []
        if not nums:
            return result
        start = end = nums[0]
        for i in range(1, len(nums) + 1):
            if i == len(nums) or nums[i - 1] + 1 != nums[i]:
                if start == end:
                    result.append(str(start))
                else:
                    result.append(str(start) + "->" + str(end))
                if i != len(nums):
                    start = end = nums[i]
            else:
                end = nums[i]
        return result

print(Solution().summaryRanges([0, 1, 2, 4, 5, 7]))
