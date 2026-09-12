class SymmetricTree {
    public static void main(String args[]) {
        TreeNode node = new TreeNode(1);
        node.left = new TreeNode(2);
        node.right = new TreeNode(2);
            node.left.left = new TreeNode(3);
            node.left.right = new TreeNode(4);
                node.right.left = new TreeNode(4);
                node.right.right = new TreeNode(3);

        //compareNode(node);
        System.out.println(compareNode(node.left, node.right));
    }

    static boolean compareNode(TreeNode node, TreeNode node2) {

        if (node == null && node2 == null) {
            return true;
        }
        
        if (node == null || node2 == null ) {
            return false;
        }

        if (node.val != node2.val) {
            return false;
        }

        return compareNode(node.left, node2.right)
            && compareNode(node.right, node2.left);
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

-------------------------------------------------------------------------------------------
//Differnt Tree Compare
// class MainClass {
//     public static void main(String args[]) {
//         TreeNode node = new TreeNode(1);
//         node.left = new TreeNode(2);
//         node.right = new TreeNode(2);
//             node.left.left = null;
//             node.left.right = new TreeNode(4);
//                 node.right.left = new TreeNode(4);
//                 node.right.right = new TreeNode(3);

//         TreeNode node2 = new TreeNode(1);
//         node2.left = new TreeNode(2);
//         node2.right = new TreeNode(2);
//             node2.left.left = new TreeNode(3);
//             node2.left.right = new TreeNode(4);
//                 node2.right.left = new TreeNode(4);
//                 node2.right.right = new TreeNode(3);

//         compareNode(node, node2);
//         System.out.println(compareNode(node.left, node.right));
//     }

//     static boolean compareNode(TreeNode node, TreeNode node2) {

//         if (node == null && node2 == null) {
//             return true;
//         }
        
//         if (node == null || node2 == null ) {
//             return false;
//         }

//         if (node.val != node2.val) {
//             return false;
//         }

//         return compareNode(node.left, node2.right)
//             && compareNode(node.right, node2.left);
//     }
// }

// class TreeNode {
//     int val;
//     TreeNode left;
//     TreeNode right;

//     TreeNode(int val) {
//         this.val = val;
//     }
// }

---------------------------------------------------------------------------------------

//LeetCode Soultion
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
//     public boolean isSymmetric(TreeNode root) {
//         return compareNode(root.left, root.right);
//     }
//     static boolean compareNode(TreeNode node, TreeNode node2) {
//         if (node == null && node2 == null) {
//             return true;
//         }

//         if (node == null || node2 == null) {
//             return false;
//         }

//         if (node.val != node2.val) {
//             return false;
//         }

//         return compareNode(node.left, node2.right)
//             && compareNode(node.right, node2.left);
//     }
// }