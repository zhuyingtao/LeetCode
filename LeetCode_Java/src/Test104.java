/**
 * Created by zyt on 2015-08-19 11:39:14
 */

public class Test104 {

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

    class Solution {
        public int maxDepth(TreeNode root) {
            if (root == null)
                return 0;
            return 1 + Math.max(this.maxDepth(root.left), this.maxDepth(root.right));
        }
    }

    public static void main(String[] args) {

    }
}