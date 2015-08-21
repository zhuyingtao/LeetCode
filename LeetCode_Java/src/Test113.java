import java.util.ArrayList;
import java.util.List;

/**
 * Created by zyt on 15/8/19 20:01.
 */
public class Test113 {

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

    public class Solution {
        public List<List<Integer>> pathSum(TreeNode root, int sum) {
            List<List<Integer>> result = new ArrayList<>();
            List<Integer> current = new ArrayList<>();
            if (root == null) {
                return result;
            }
            return this.pathSum(root, sum, current, result);
        }

        public List<List<Integer>> pathSum(TreeNode root, int sum, List<Integer> current, List<List<Integer>> result) {
            current.add(root.val);
            if (root.left == null && root.right == null && root.val == sum) {
                result.add(new ArrayList<>(current));
            }
            if (root.left != null) {
                this.pathSum(root.left, sum - root.val, current, result);
            }
            if (root.right != null) {
                this.pathSum(root.right, sum - root.val, current, result);
            }
            current.remove(current.size() - 1);
            return result;
        }
    }
}
