__author__ = 'zyt'

# Definition for singly-linked list.
class ListNode:
    def __init__(self, x):
        self.val = x
        self.next = None

class Solution:
    # @param two ListNodes
    # @return the intersected ListNode
    def getIntersectionNode(self, headA, headB):
        curA, curB = headA, headB
        lenA = lenB = 0
        while curA:
            lenA += 1
            curA = curA.next
        while curB:
            lenB += 1
            curB = curB.next

        curA, curB = headA, headB
        while lenA > lenB:
            curA = curA.next
            lenA -= 1
        while lenB > lenA:
            curB = curB.next
            lenB -= 1

        while curA is not curB:
            curA = curA.next
            curB = curB.next
        return curA

Solution().getIntersectionNode(1, 2)
