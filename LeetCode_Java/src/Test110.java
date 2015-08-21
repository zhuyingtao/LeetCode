/**
 * Created by zyt on 15/8/19 17:01.
 */
public class Test110 {
    /**
     * Definition for a binary tree node.
     */
    private class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    static class Solution {
        boolean isBalanced = true;

        public boolean isBalanced(TreeNode root) {
            this.depth(root);
            return isBalanced;
        }

        public int depth(TreeNode root) {
            if (root == null) return 0;
            int left = 1 + this.depth(root.left);
            int right = 1 + this.depth(root.right);
            if (Math.abs(left - right) > 1) {
                isBalanced = false;
                return 0;
            }
            return Math.max(left, right);
        }
    }
}
