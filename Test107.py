from collections import deque

__author__ = 'zyt'


# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, x):
#         self.val = x
#         self.left = None
#         self.right = None

class Solution:
    # @param {TreeNode} root
    # @return {integer[][]}
    def levelOrderBottom(self, root):
        if not root: return []
        result = []
        nodes, indexs = deque([root]), deque([0])
        while nodes:
            node = nodes.popleft()
            index = indexs.popleft()
            if node.left:
                nodes.append(node.left)
                indexs.append(index + 1)
            if node.right:
                nodes.append(node.right)
                indexs.append(index + 1)
            if index < len(result):
                result[index].append(node.val)
            else:
                result.append([node.val])
        result.reverse()
        return result
