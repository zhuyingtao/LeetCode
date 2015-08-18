__author__ = 'zyt'

# Definition for singly-linked list.
class ListNode:
    def __init__(self, x):
        self.val = x
        self.next = None

class Solution:
    # @param {ListNode} head
    # @return {ListNode}
    def reverseList(self, head):
        if not head:
            return None
        now = head.next
        head.next = None  # must close the list !!
        while now:
            tail = now.next
            now.next = head
            head = now
            now = tail
        return head

node = ListNode(1)
# node.next=ListNode(2)
print(Solution().reverseList(node))
