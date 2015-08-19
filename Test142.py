__author__ = 'zyt'


# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution:
    # @param head, a ListNode
    # @return a list node
    def detectCycle(self, head):
        if not head:
            return None
        while head:
            if head.val == None:
                return head
            head.val = None
            head = head.next
        return None
