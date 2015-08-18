__author__ = 'zyt'


class Solution:
    # @param {integer} n
    # @return {string}
    def countAndSay(self, n):
        time = 1
        l = str(1)
        while time < n:
            count, say, new = 0, l[0], []
            for char in l:
                if char == say:
                    count += 1
                else:
                    new.append(str(count) + say)
                    count, say = 1, char
            new.append(str(count) + say)
            l = "".join(new)
            time += 1
        return l


print(Solution().countAndSay(5))
