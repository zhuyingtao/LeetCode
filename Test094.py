__author__ = 'zyt'


# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, x):
#         self.val = x
#         self.left = None
#         self.right = None

class Solution:
    # @param {TreeNode} root
    # @return {integer[]}
    def inorderTraversal(self, root):
        list = []
        if root:
            list += self.inorderTraversal(root.left)
            list += root.val,
            list += self.inorderTraversal(root.right)
        return list
