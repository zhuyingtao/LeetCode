__author__ = 'zyt'


# Definition for a binary tree node.
class TreeNode:
    def __init__(self, x):
        self.val = x
        self.left = None
        self.right = None


class Solution:
    # @param {TreeNode} root
    # @return {integer}
    def sumNumbers(self, root):
        res, cur = [], ""
        if root:
            self.pathNumber(root, res, cur)
        return sum(res)

    def pathNumber(self, root, res, cur):
        cur += str(root.val)
        if not root.left and not root.right:
            res.append(int(cur))
        if root.left:
            self.pathNumber(root.left, res, cur)
        if root.right:
            self.pathNumber(root.right, res, cur)


root = TreeNode(1)
root.left = TreeNode(2)
root.right = TreeNode(3)
print(Solution().sumNumbers(root))
