class MainClass {
    public static void main(String args[]){
        TreeNode node = new TreeNode(1);
        node.left = new TreeNode(2);
        node.right = new TreeNode(3);
        node.right.left = new TreeNode(4);
        node.right.right = new TreeNode(5);

        System.out.print(minDepth(node));
        
    }
    static int minDepth(TreeNode node) {
        if (node == null) {
            return 0;
        }
        int left = minDepth(node.left);
        int right = minDepth(node.right);

        if (left == 0) {
        return 1 + right;
    }

    if (right == 0) {
        return 1 + left;
    }

        if (left>right) {
            return 1 + right;
        } else {
            return 1 + left;
        }
    }
}

class TreeNode{
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
    public int minDepth(TreeNode root) {
        return minMethod(root);
    }

    static int minMethod(TreeNode node) {
        if (node == null) {
            return 0;
        }

        int left = minMethod(node.left);
        int right = minMethod(node.right);

        if (left == 0) {
            return 1 + right;
        }
        if (right == 0) {
            return 1 + left;
        }
        if (left>right) {
            return 1 + right;
        } else {
            return 1 + left;
        }
    }
}