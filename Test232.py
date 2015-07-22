__author__ = 'zyt'

class Queue:
    # initialize your data structure here.
    def __init__(self):
        self.list = []
        self.head = 0

    # @param x, an integer
    # @return nothing
    def push(self, x):
        self.list.append(x)

    # @return nothing
    def pop(self):
        self.head += 1

    # @return an integer
    def peek(self):
        return self.list[self.head]

    # @return an boolean
    def empty(self):
        return self.head == len(self.list)
