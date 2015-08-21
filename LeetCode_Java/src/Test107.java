import java.util.*;

/**
 * Created by zyt on 15/8/19 19:54.
 */
public class Test107 {

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
        public List<List<Integer>> levelOrderBottom(TreeNode root) {
            List<List<Integer>> lists = new ArrayList<>();
            List<Integer> list = new ArrayList<>();
            if (root == null) {
                return lists;
            }
            Queue<TreeNode> queue = new LinkedList<>();
            Queue<Integer> level = new LinkedList<>();
            queue.add(root);
            level.add(0);
            int preLev = 0;
            while (!queue.isEmpty()) {
                TreeNode node = queue.poll();
                int lev = level.poll();
                if (lev != preLev) {
                    lists.add(list);
                    list = new ArrayList<>();
                    preLev = lev;
                }
                list.add(node.val);

                if (node.left != null) {
                    queue.add(node.left);
                    level.add(lev + 1);
                }
                if (node.right != null) {
                    queue.add(node.right);
                    level.add(lev + 1);
                }
            }
            lists.add(list);
            Collections.reverse(lists);
            return lists;
        }
    }

}
