__author__ = 'zyt'

# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution:
    # @param {ListNode} head
    # @param {integer} n
    # @return {ListNode}
    def removeNthFromEnd(self, head, n):
        if not head: return None
        start = end = head
        count = 0
        while count < n:
            end = end.next
            count += 1
        if not end:
            return head.next
        while end.next:
            start = start.next
            end = end.next
        start.next = start.next.next
        return head
