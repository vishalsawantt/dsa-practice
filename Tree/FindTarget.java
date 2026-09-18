class FindTarget {
    public static void main(String args[]) {
        TreeNode node = new TreeNode(1);
        node.left  = new TreeNode(2);
        node.right = new TreeNode(3);
        node.left.left = new TreeNode(4);
        node.left.right = new TreeNode(5);
        node.right.left = new TreeNode(6);

        int target = 8;
        System.out.print(findTarget(node, 0, target));
    }
    static boolean findTarget(TreeNode node, int sum, int target) {
        if (node == null) {
            return false;
        }
        sum = sum + node.val;
        if (node.left == null && node.right == null) {
            return sum == target;
        }

        return findTarget(node.left, sum, target) ||
            findTarget(node.right, sum, target);
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
    public boolean hasPathSum(TreeNode root, int targetSum) {
        return findTarget(root, 0, targetSum);   
    }

    static boolean findTarget(TreeNode node, int sum, int target) {
        if (node == null) {
            return false;
        }
        sum = sum + node.val;
        if (node.left == null && node.right == null) {
            return sum == target;
        }
        return findTarget(node.left, sum, target) || findTarget(node.right, sum, target);
    }
}