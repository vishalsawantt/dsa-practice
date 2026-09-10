class inordertravel {
    public static void main(String args[]) {
        TreeNode node = new TreeNode(1);
        
        node.left = null;
        node.right = new TreeNode(2);

        node.right.left = new TreeNode(3);
        node.right.right = null;

        inorder(node);
    }
    static void inorder(TreeNode node) {
        if (node == null)  {
            return;
        }
        inorder(node.left);
        System.out.print(node.val + " ,");
        inorder(node.right);
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

//Leet Code

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

// class Solution {
//     public List<Integer> inorderTraversal(TreeNode root) {
//         List<Integer> result = new ArrayList<>();
//         inorder(root, result);
//         return result;
//     }

//     static void inorder(TreeNode root , List<Integer> result) {
//         if (root == null) {
//             return;
//         }

//         inorder(root.left, result);
//         result.add(root.val);
//         inorder(root.right, result);
//     }
// }