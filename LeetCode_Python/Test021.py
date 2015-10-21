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
    def mergeTwoLists(self, l1, l2):
        # if l1 == None:
        #     return l2
        # elif l2 == None:
        #     return l1
        #
        # end = start = None
        # if l1.val <= l2.val:
        #     end = start = l1
        #     l1 = l1.next
        # else:
        #     end = start = l2
        #     l2 = l2.next
        #
        # while (l1 != None and l2 != None):
        #     if l1.val <= l2.val:
        #         end.next = l1
        #         l1 = l1.next
        #     else:
        #         end.next = l2
        #         l2 = l2.next
        #     end = end.next
        #
        # while (l1 != None):
        #     end.next = l1
        #     l1 = l1.next
        #     end = end.next
        # while (l2 != None):
        #     end.next = l2
        #     l2 = l2.next
        #     end = end.next
        # return start

        # A more nice version with same algorithm
        head = temp = ListNode(0)
        while (l1 and l2):
            if l1.val <= l2.val:
                temp.next = l1
                l1 = l1.next
            else:
                temp.next = l2
                l2 = l2.next
            temp = temp.next
        temp.next = l1 or l2
        return head.next
