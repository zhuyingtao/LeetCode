__author__ = 'zyt'


class Solution:
    # @param {integer[]} nums
    # @return {integer}
    def majorityElement(self, nums):
        # times = {}
        # for i in nums:
        #     if times.__contains__(i):
        #         times[i] += 1
        #     else:
        #         times[i] = 1
        #     if times[i] > len(nums) / 2:
        #         return i

        # Moore's vote algorithm
        # Every number in the vector votes for itself,
        # the majority number gets the most votes. Different number offsets the votes.
        count = 0
        major = 0
        for i in nums:
            if count == 0:
                major = i
                count = 1
            elif major == i:
                count += 1
            else:
                count -= 1
        return major


print(Solution().majorityElement([1, 2, 3, 4, 3, 3, 3]))  # i > n/2
