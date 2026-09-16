class BalancedTree {
    public static void main(String args[]) {
        TreeNode node = new TreeNode(1);
        node.left = new TreeNode(2);
        node.right = new TreeNode(3);
        node.right.left = new TreeNode(4);
        node.right.right = new TreeNode(5);

        System.out.println(balancedTree(node));

        //printNode(node);
    }
    static boolean balancedTree(TreeNode node) {

    if (node == null) {
        return true;
    }

    int left = maxDepth(node.left);
    int right = maxDepth(node.right);

    if (left - right > 1 || right - left > 1) {
        return false;
    }

    return balancedTree(node.left) && balancedTree(node.right);
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
    
    // static void printNode(TreeNode node) {
    //     if (node == null) {
    //         System.out.print("null,");
    //         return;
    //     }
    //     System.out.print(node.val + ",");
    //     printNode(node.left);
    //     printNode(node.right);
    // }
}

class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int val){
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
    public boolean isBalanced(TreeNode root) {
        if (root == null) {
            return true;
        }
        int left = maxDepth(root.left);
        int right = maxDepth(root.right);

        if (left-right > 1 || right-left>1) {
            return false;
        }
        return isBalanced(root.left) && isBalanced(root.right);
    }
    static int maxDepth(TreeNode root) {
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