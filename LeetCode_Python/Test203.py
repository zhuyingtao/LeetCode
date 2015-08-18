__author__ = 'zyt'

# Definition for singly-linked list.
class ListNode:
    def __init__(self, x):
        self.val = x
        self.next = None

class Solution:
    # @param {ListNode} head
    # @param {integer} val
    # @return {ListNode}
    def removeElements(self, head, val):
        if not head:
            return None
        p = ListNode(0)
        p.next = head
        head = p
        while p.next:
            if p.next.val == val:
                p.next = p.next.next
            else:
                p = p.next
        return head.next
