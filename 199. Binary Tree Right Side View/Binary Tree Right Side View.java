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
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> result = new ArrayList<>();

        if(root == null) {
            return result;
        }

        Queue <TreeNode> queue = new LinkedList<>();
        queue.add(root);

        while(!queue.isEmpty()) {
            int levelSize = queue.size();

            for(int i=0;i<levelSize;i++) {
                TreeNode currNode = queue.poll();

                //Add the last node's value of each level to the result 
                if(i == levelSize - 1) {
                    result.add(currNode.val);
                }

                //Add child nodes to the queue for the next level
                if(currNode.left != null) {
                    queue.add(currNode.left);
                }

                if(currNode.right != null) {
                    queue.add(currNode.right);
                }
            }
        }
        
        return result;
    }
}
