class InvertBinaryTree {
    public static void main(String args[]) {
        TreeNode node = new TreeNode(1);
        node.left = new TreeNode(2);
        node.right = new TreeNode(3);
        node.left.left = new TreeNode(4);
        node.left.right = new TreeNode(5);
        node.right.left = new TreeNode(6);
        node.right.right = new TreeNode(7);

        TreeNode result = invertTree(node);
        printTree(result);
    }
    static TreeNode invertTree(TreeNode node) {
        if (node == null) {
            return null;
        }
        TreeNode tmp = node.left;
        node.left = node.right;
        node.right = tmp;

        invertTree(node.left);
        invertTree(node.right);

        return node;
    }
    static void printTree(TreeNode node) {
        if (node == null) {
            return;
        }
        System.out.print(node.val + " ,");
        printTree(node.left);
        printTree(node.right);
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
    public TreeNode invertTree(TreeNode root) {
        if (root == null) {
            return null;
        }
        TreeNode tmp = root.left;
        root.left = root.right;
        root.right = tmp;

        invertTree(root.left);
        invertTree(root.right);
        return root;
    }
}