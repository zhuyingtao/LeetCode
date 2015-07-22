__author__ = 'zyt'

class Solution:
    # @param {integer[]} nums
    # @param {integer} k
    # @return {boolean}
    def containsNearbyDuplicate(self, nums, k):
        dic = {}
        for i in range(len(nums)):
            if nums[i] in dic and i - dic[nums[i]] <= k:
                return True
            else:
                dic[nums[i]] = i
        return False

print(Solution().containsNearbyDuplicate([-1, -1], 1))
