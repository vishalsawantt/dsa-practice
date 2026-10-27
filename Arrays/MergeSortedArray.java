import java.util.*;

class MergeSortedArray {
    public static void main(String args[]) {
        int num1[] = {1,2,3,0,0,0};
        int m = 3;
        int num2[] = {2,5,6};
        int n = 3;
        for (int i = 0; i<n;i++) {
            num1[m+i] = num2[i];
        }
        Arrays.sort(num1);
        System.out.print(Arrays.toString(num1));
    }
}

//LeetCode
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        for (int i = 0;i<n;i++) {
            nums1[m+i] = nums2[i];
        }
        Arrays.sort(nums1);
    }
}