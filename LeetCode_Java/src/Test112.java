/**
 * Created by zyt on 15/8/19 20:30.
 */
public class Test112 {
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

    private class Solution {
        public boolean hasPathSum(TreeNode root, int sum) {
            if (root == null) {
                return false;
            }
            if (root.left == null && root.right == null && root.val == sum) {
                return true;
            }
            boolean left = this.hasPathSum(root.left,sum-root.val);
            boolean right = this.hasPathSum(root.right, sum - root.val);
            return left || right;
        }
    }
}
