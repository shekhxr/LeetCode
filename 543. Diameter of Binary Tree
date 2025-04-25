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
    int maxDiameter = 0;
    private int getHeight(TreeNode node) {
        //Base Case
        if(node == null) {
            return 0;
        }

        int leftHeight = getHeight(node.left); //Height of left subtree
        int rightHeight = getHeight(node.right); //Height of right subtree

        //Update the maximum diameter if needed
        maxDiameter = Math.max(maxDiameter, leftHeight + rightHeight);

        //Return the height of the current node
        return Math.max(leftHeight, rightHeight) + 1;
    }

    public int diameterOfBinaryTree(TreeNode root) {
        getHeight(root);
        return maxDiameter;
    }
}
