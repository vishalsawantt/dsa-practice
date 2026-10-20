
class MainClass {
    public static void main(String args[]) {
        TreeNode node = new TreeNode(1);
        node.left = new TreeNode(2);
        node.right = new TreeNode(3);
        node.right.left = new TreeNode(4);
        node.right.right = new TreeNode(5);

        int sum = sumOfLeftLeaves(node);

        System.out.println(sum); 
    }

    static int sumOfLeftLeaves(TreeNode node) {
        if (node == null) {
            return 0;
        }

        int sum = 0;

        if (node.left != null &&
            node.left.left == null &&
            node.left.right == null) {
            sum += node.left.val;
        }

        sum += sumOfLeftLeaves(node.left);
        sum += sumOfLeftLeaves(node.right);

        return sum;
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
    public int sumOfLeftLeaves(TreeNode root) {
        if (root == null) {
            return 0;
        }

        int sum = 0;

        if (root.left != null &&
            root.left.left == null &&
            root.left.right == null) {
            sum += root.left.val;
        }

        sum += sumOfLeftLeaves(root.left);
        sum += sumOfLeftLeaves(root.right);

        return sum;
    }
}