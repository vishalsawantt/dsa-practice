class PostOrderTree{
    public static void main(String args[]) {
        TreeNode node = new TreeNode(1);
        node.left = new TreeNode(2);
        node.right = new TreeNode(3);
        node.left.left = new TreeNode(4);
        node.left.right = new TreeNode(5);

        postOrder(node);
    }
    static void postOrder(TreeNode n) {
        if (n == null) {
            return;
        }
        postOrder(n.left);
        postOrder(n.right);
        System.out.print(n.val + " ,");
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
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        postOrder(root, result);
        return result;
    }
    static void postOrder(TreeNode node, List<Integer> result) {
        if (node == null) {
            return;
        }
        postOrder(node.left, result);
        postOrder(node.right, result);
        result.add(node.val);
    }
}