__author__ = 'zyt'


# Definition for a binary tree node.
class TreeNode:
    def __init__(self, x):
        self.val = x
        self.left = None
        self.right = None


class Solution:
    # @param {TreeNode} root
    # @return {string[]}
    def binaryTreePaths(self, root):
        if not root:
            return []
        else:
            result, current = [], []
            self.binaryTreePath(root, result, current)
            return result

    def binaryTreePath(self, root, result, current):
        current.append(str(root.val))
        if not root.left and not root.right:
            result.append("->".join(current))
        if root.left:
            self.binaryTreePath(root.left, result, current)
        if root.right:
            self.binaryTreePath(root.right, result, current)
        current.pop()


print(Solution().binaryTreePaths(root))
