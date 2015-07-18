__author__ = 'zyt'

# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution:
    # @param head, a ListNode
    # @return a boolean
    def hasCycle(self, head):
        # while (head != None):
        #     if (head.val == -1000):
        #         return True
        #     head.val = -1000
        #     head = head.next
        # return False

        # a best solution by using two runner!
        # use faster and lower runner solution. (2 pointers)
        # the faster one move 2 steps, and slower one move only one step.
        # if there's a circle, the faster one will finally "catch" the slower one.
        # (the distance between these 2 pointers will decrease one every time.)
        # if there's no circle, the faster runner will reach the end of linked list. (NULL)
        slow = head
        fast = head
        while (fast != None and fast.next != None):
            fast = fast.next.next
            slow = slow.next
            if (fast == next):
                return True
        return False
