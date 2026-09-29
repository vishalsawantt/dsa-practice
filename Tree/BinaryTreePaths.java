class BinaryTreePaths {
    public static void main(String args[]) {
        TreeNode node = new TreeNode(1);
        node.left = new TreeNode(2);
        node.right = new TreeNode(3);
        node.left.right = new TreeNode(5);
        returnPath(node, ""); 
    }
    static void returnPath(TreeNode node, String path) {
        if (node == null) {
            return;
        }
        path = path + node.val;
        if (node.left == null && node.right == null) {
            System.out.println(path);
            return;
        }
        returnPath(node.left, path + "-");
        returnPath(node.right, path + "-");
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


//Leetcode
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
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> result = new ArrayList<>();
        returnPath(root,"",result);
        return result;
    }
    static void returnPath(TreeNode node, String path, List<String> result) {
        if (node == null) {
            return;
        }
        path = path + node.val;
        if (node.left == null && node.right == null) {
            result.add(path);
            return;
        }
        returnPath(node.left, path + "->", result);
        returnPath(node.right, path + "->", result);
    }
}