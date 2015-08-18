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
    def postorderTraversal(self, root):
        res = []
        stack = [root]
        while stack:
            root = stack.pop()
            if root:
                res.insert(0, root.val)
                stack.append(root.left)
                stack.append(root.right)
        return res
