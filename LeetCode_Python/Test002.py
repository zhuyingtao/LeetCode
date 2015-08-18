__author__ = 'zyt'


# Definition for singly-linked list.
class ListNode:
    def __init__(self, x):
        self.val = x
        self.next = None


class Solution:
    # @param {ListNode} l1
    # @param {ListNode} l2
    # @return {ListNode}
    def addTwoNumbers(self, l1, l2):
        head = temp = ListNode(0)
        flag = 0
        while l1 or l2 or flag:
            v1 = v2 = 0
            if l1:
                v1 = l1.val
                l1 = l1.next
            if l2:
                v2 = l2.val
                l2 = l2.next
            sum = v1 + v2 + flag
            flag = sum // 10
            temp.next = ListNode(sum % 10)
            temp = temp.next
        return head.next


Solution().addTwoNumbers(ListNode(0), ListNode(0))
