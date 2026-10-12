import java.util.*;

class MoveZeroes {
    public static void main(String args[]) {
        int arr[] = {1,2,0,4,0,5,0,6};
        int index = 0;
        for (int i = 0;i<arr.length;i++) {
            if (arr[i] != 0) {
                arr[index] = arr[i];
                index++;
            }
        }
        while(index<arr.length) {
            arr[index] = 0;
            index++;
        }
        System.out.print(Arrays.toString(arr));
    }
}

//LeetCode
class Solution {
    public void moveZeroes(int[] nums) {
        int index = 0;
        for(int i = 0;i<nums.length;i++) {
            if (nums[i]!=0) {
                nums[index] = nums[i];
                index++;
            }
        }
        while(index<nums.length) {
            nums[index] = 0;
            index++;
        }
    }
}