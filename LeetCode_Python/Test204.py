__author__ = 'zyt'

class Solution:
    # @param {integer} n
    # @return {integer}
    # Time complexity : O(n**1.5)
    def countPrimes1(self, n):
        count = 0
        for i in range(n):
            if i % 100000 == 0:
                print(i)
            if self.isPrime(i):
                count += 1
        return count

    def isPrime(self, num):
        if (num <= 1):
            return False
        for i in range(2, int(num ** 0.5 + 1)):
            if num % i == 0:
                return False
        return True

    # another algorithm
    # Time complexity : O(n*log log n )
    def countPrimes(self, n):
        if n < 2: return 0
        isPrime = [True] * n
        isPrime[0] = isPrime[1] = False
        for i in range(2, n):
            if not isPrime[i]: continue
            j = i * i
            while j < n:
                isPrime[j] = False
                j += i
        return len([i for i in isPrime if i])

print(Solution().countPrimes(1500000))
