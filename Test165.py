__author__ = 'zyt'

class Solution:
    # @param {string} version1
    # @param {string} version2
    # @return {integer}
    def compareVersion(self, version1, version2):
        v1 = version1.split('.')
        v2 = version2.split('.')
        size = max(len(v1), len(v2))
        v1 += ['0'] * (size - len(v1))
        v2 += ['0'] * (size - len(v2))
        # print(v1,v2)
        for i in range(size):
            if int(v1[i]) < int(v2[i]):
                return -1
            elif int(v1[i]) > int(v2[i]):
                return 1
        return 0

print(Solution().compareVersion("1", "1.1"))
