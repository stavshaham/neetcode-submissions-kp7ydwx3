# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right

class Solution:
    def maxDepth(self, root: Optional[TreeNode]) -> int:
        if root == None:
            return 0
        
        if root.right == None and root.left == None:
            return 1

        if (root.left and root.right):
            left = 1 + self.maxDepth(root.left)
            right = 1 + self.maxDepth(root.right)
            return max(left, right)

        if (root.right):
            return 1 + self.maxDepth(root.right)

        if (root.left):
            return 1 + self.maxDepth(root.left)

        
        