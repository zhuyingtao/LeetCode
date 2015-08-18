from collections import deque

__author__ = 'zyt'


# Definition for binary tree with next pointer.
# class TreeLinkNode:
#     def __init__(self, x):
#         self.val = x
#         self.left = None
#         self.right = None
#         self.next = None

class Solution:
    # @param root, a tree link node
    # @return nothing
    def connect(self, root):
        if not root:
            return
        nodes, indexs = deque([root]), deque([0])
        preIndex = 0
        while nodes:
            node = nodes.popleft()
            index = indexs.popleft()
            if not indexs or indexs[0] != index:
                node.next = None
            else:
                node.next = nodes[0]
            if node.left:
                nodes.append(node.left)
                indexs.append(index + 1)
            if node.right:
                nodes.append(node.right)
                indexs.append(index + 1)
