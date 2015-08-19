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
    # @return {integer[][]}
    def pathSum(self, root, sum):
        res, cur = [], []
        if root:
            self.pathSum2(root, sum, cur, res)
        return res

    def pathSum2(self, root, sum, cur, res):
        cur.append(root.val)
        if not root.left and not root.right and root.val == sum:
            res.append(cur[:])
        if root.left:
            self.pathSum2(root.left, sum - root.val, cur, res)
        if root.right:
            self.pathSum2(root.right, sum - root.val, cur, res)
        cur.pop()
