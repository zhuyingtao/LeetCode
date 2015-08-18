__author__ = 'zyt'

# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution:
    # @param {ListNode} head
    # @return {ListNode}
    def deleteDuplicates(self, head):
        if head == None:
            return None
        start = head
        end = head.next
        while end != None:
            if end.val == start.val:
                end = end.next
            else:
                start.next = end
                start = end
                end = end.next
        start.next = end
        return head