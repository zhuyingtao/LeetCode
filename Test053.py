__author__ = 'zyt'


class Solution:
    # @param {integer[]} nums
    # @return {integer}
    def maxSubArray(self, nums):
        if not nums: return 0
        sum, ans = 0, nums[0]
        for num in nums:
            sum += num
            ans = max(sum, ans)
            sum = max(sum, 0)
        return ans


print(Solution().maxSubArray([1]))
