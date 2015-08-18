from collections import deque

__author__ = 'zyt'

class Stack:
    # initialize your data structure here.
    def __init__(self):
        self.inQueue = deque()

    # @param x, an integer
    # @return nothing
    def push(self, x):
        self.inQueue.append(x)

    # @return nothing
    def pop(self):
        self.inQueue.pop()

    # @return an integer
    def top(self):
        return self.inQueue[-1]

    # @return an boolean
    def empty(self):
        return len(self.inQueue) == 0
