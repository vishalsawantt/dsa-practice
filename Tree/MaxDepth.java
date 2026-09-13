class MaxDepth {
    public static void main(String args[]) {
        TreeNode node = new TreeNode(1);
        node.left = new TreeNode(2);
        node.right = new TreeNode(3);
        
        node.left.left = new TreeNode(4);
        node.left.right = new TreeNode(5);

        System.out.println(maxDepth(node));
    }

    static int maxDepth(TreeNode node) {
        if (node == null) {
            return 0;
        }

        int left = maxDepth(node.left);
        int right = maxDepth(node.right);

        if (left > right) {
            return 1 + left;
        } else {
            return 1 + right;
        }
    }
    
}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int val) {
        this.val = val;
    }
}


//LeetCode
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
    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }  

        int left = maxDepth(root.left);
        int right = maxDepth(root.right);

        if (left > right) {
            return 1 + left;
        } else {
            return 1 + right;
        }
    }
}