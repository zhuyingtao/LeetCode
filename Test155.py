__author__ = 'zyt'


class MinStack:
    # initialize your data structure here.
    def __init__(self):
        self.stack = []
        self.min = 0

    # @param x, an integer
    # @return nothing
    def push(self, x):
        if len(self.stack) == 0:
            self.min = x
        self.stack.append(x - self.min)
        if x < self.min:
            self.min = x

    # @return nothing
    def pop(self):
        x = self.stack.pop()
        if x < 0:
            self.min -= x

    # @return an integer
    def top(self):
        x = self.stack[-1]
        if x < 0:
            return self.min
        else:
            return self.min + self.stack[-1]

    # @return an integer
    def getMin(self):
        return self.min