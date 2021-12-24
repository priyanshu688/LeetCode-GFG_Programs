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
    public int sumOfLeftLeaves(TreeNode root) {
        if (root == null) {
            return 0;
        }
        if (root.left == null) {
            return sumOfLeftLeaves(root.right);
        }
        else {
            int count = 0;
            if (root.left.left == null && root.left.right == null) {
                count += root.left.val;
            }
            else {
                count += sumOfLeftLeaves(root.left);
            }
            count += sumOfLeftLeaves(root.right);
            return count;
        }
    }
}