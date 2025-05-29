import java.util.ArrayList;
import java.util.List;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int val) {
        this.val = val;
        this.left = null;
        this.right = null;
    }
}

public class FindLeavesofaBinaryTree {
    public List<List<Integer>> collectLeaves(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        while(root != null) {
            List<Integer> leaves = new ArrayList<>();
            root = removeLeaves(root, leaves);
            result.add(leaves);
        }    

        return result;
    }

    public TreeNode removeLeaves(TreeNode node, List<Integer> leaves) {
        if(node == null) {
            return null;
        }

        if(node.left == null && node.right == null) {
            leaves.add(node.val);
            return null; //Remove the leaf node
        }

        node.left = removeLeaves(node.left, leaves);
        node.right = removeLeaves(node.right, leaves);

        return node; //Return the updated tree
    }
    
}
