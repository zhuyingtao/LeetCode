__author__ = 'zyt'

# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution:
    # @param {ListNode} head
    # @return {boolean}
    def isPalindrome(self, head):
        # if not head:
        #     return True
        # list = []
        # while head:
        #     list.append(head.val)
        #     head = head.next
        # for i in range(len(list)):
        #     if list[i] != list[-i - 1]:
        #         return False
        #     if i >= len(list) / 2:
        #         return True

        # a more pretty one
        list = []
        while head:
            list += head.next,  # note the comma, another method is: list.append(head.val)
            head = head.next
        return list == list[::-1]
