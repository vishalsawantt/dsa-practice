class SameTree {
    public static void main(String args[]) {
        TreeNode node = new TreeNode(1);
        node.left = null;
        node.right = new TreeNode(3);

        TreeNode node2 = new TreeNode(1);
        node2.left = new TreeNode(2);
        node2.right = new TreeNode(3);

        //printNode(node);
        //compareNode(node, node2);
        System.out.println(compareNode(node, node2));
    }

    static boolean compareNode(TreeNode node, TreeNode node2) {
        if (node == null && node2 == null) {
            return true;
        }

        if (node == null || node2 == null) {
            return false;
        }

        if (node.val != node2.val) {
            return false;
        }

        return compareNode(node.left, node2.left)
        && compareNode(node.right, node2.right);
    } 

    // static void printNode(TreeNode node) {
    //     if (node == null) {
    //         return;
    //     }
    //     //Inorder print left+root+right
    //     // printNode(node.left);
    //     // System.out.print(node.val + " ,");
    //     // printNode(node.right);

    //     //Preorder print root+left+right
    //     System.out.print(node.val + " ,");
    //     printNode(node.left);
    //     printNode(node.right);
    //}
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

// class Solution {
//     public boolean isSameTree(TreeNode p, TreeNode q) {
//         if (p == null && q == null) {
//             return true;
//         }

//         if (p == null || q == null) {
//             return false;
//         }

//         if (p.val != q.val) {
//             return false;
//         }

//         return isSameTree(p.left , q.left)  && isSameTree(p.right, q.right);
//     }
// }