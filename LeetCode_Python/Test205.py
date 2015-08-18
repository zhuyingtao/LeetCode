__author__ = 'zyt'

class Solution:
    # @param {string} s
    # @param {string} t
    # @return {boolean}
    def isIsomorphic(self, s, t):
        # ds = {}  # can't ds=dt={}
        # dt = {}
        # cs = ct = 0
        # for i in range(len(s)):
        #     if s[i] not in ds:
        #         ds[s[i]] = cs
        #         cs += 1
        #     if t[i] not in dt:
        #         dt[t[i]] = ct
        #         ct += 1
        # for i in range(len(s)):
        #     if ds[s[i]] != dt[t[i]]:
        #         return False
        # return True

        return len(set(zip(s, t))) == len(set(s)) == len(set(t))

print(Solution().isIsomorphic("paper", "title"))
