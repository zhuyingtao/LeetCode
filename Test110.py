__author__ = 'zyt'


# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, x):
#         self.val = x
#         self.left = None
#         self.right = None

class Solution:
    isBalance = True
    # @param {TreeNode} root
    # @return {boolean}
    def isBalanced(self, root):
        self.depth(root)
        return self.isBalance

    def depth(self, root):
        if not root:
            return 0
        left = self.depth(root.left)
        right = self.depth(root.right)
        if abs(left - right) > 1:
            self.isBalance = False
            return 0
        return 1 + max(left, right)
