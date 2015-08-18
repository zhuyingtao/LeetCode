__author__ = 'zyt'

# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, x):
#         self.val = x
#         self.left = None
#         self.right = None

class Solution:
    # @param {TreeNode} root
    # @param {integer} sum
    # @return {boolean}
    def hasPathSum(self, root, sum):
        if not root:
            return False
        if not root.left and not root.right:
            return root.val == sum
        return self.hasPathSum(root.left, sum - root.val) or self.hasPathSum(root.right, sum - root.val)
        # left = right = False
        # if root.left:
        #     left = self.hasPathSum(root.left, sum - root.val)
        # if root.right:
        #     right = self.hasPathSum(root.right, sum - root.val)
        # return left or right
