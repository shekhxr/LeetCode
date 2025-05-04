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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        if(root == null) {
            return new ArrayList<List<Integer>>();
        }

        List<List<Integer>> results = new ArrayList<List<Integer>>();

        LinkedList<TreeNode> node_queue = new LinkedList<TreeNode>();
        node_queue.addLast(root);
        node_queue.addLast(null);

        LinkedList<Integer> level_list = new LinkedList<Integer>();
        boolean isOrderLeft = true;

        while(node_queue.size() > 0) {
            TreeNode currNode = node_queue.pollFirst();
            if(currNode != null) {
                if(isOrderLeft) {
                    level_list.addLast(currNode.val);
                } else {
                    level_list.addFirst(currNode.val);
                }

                if(currNode.left != null) {
                    node_queue.addLast(currNode.left);
                }

                if(currNode.right != null) {
                    node_queue.addLast(currNode.right);
                }

            } else {
                results.add(level_list); //We scanned one level
                level_list = new LinkedList<Integer>();

                //Preparing for the next level
                if(node_queue.size() > 0) {
                    node_queue.addLast(null);
                }

                isOrderLeft = !isOrderLeft;
            }
        }

        return results;
    }
}
