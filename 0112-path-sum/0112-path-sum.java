/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public boolean hasPathSum(TreeNode root, int targetSum) {
          
        return traverse(root, targetSum);
    }

    private static boolean traverse(TreeNode node, int sum) {
        if (node != null) {
            if (node.left == null && node.right == null && node.val == sum) {
                return true;
            }

            if (traverse(node.left, sum - node.val)) {
                return true;
            }

            if (traverse(node.right, sum - node.val)) {
                return true;
            }
        }

        return false;
    }
}