class SorttedArraytoTree {
    public static void main(String args[]) {
        int nums[] = {-10,-3,0,5,9};
         TreeNode root = createTree(nums, 0, nums.length - 1);

        System.out.println(root.val);
        // node.left = new TreeNode(-3);
        // node.left.left = new TreeNode(-10);

        // node.right = new TreeNode(5);
        // node.right.left = new TreeNode(9);
    
        //System.out.println(nums[middle]);

        
    }

    static TreeNode createTree(int nums[], int left, int right) {
        if (left > right) {
            return null;
        }
        int middle = (left + right) /2;
        TreeNode node = new TreeNode(nums[middle]);
        node.left = createTree(nums, left , middle -1);
        node.right = createTree(nums , middle +1, right);
        return node;
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
    public TreeNode sortedArrayToBST(int[] nums) {
        return createNode(nums, 0, nums.length-1); 
    }
    static TreeNode createNode(int nums[] , int left, int right) {
        if (left > right) {
            return null;
        }
        int middle = (left + right)/2;
        TreeNode node = new TreeNode(nums[middle]);
        node.left = createNode(nums, left, middle - 1);
        node.right = createNode(nums, middle + 1, right);
        return node;
    }
}