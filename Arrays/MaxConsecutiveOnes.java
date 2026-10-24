import java.util.*;

class MainClass {
    public static void main(String args[]) {
        int num[] = {0,1,1,0,1,1,1};
        int count = 0;
        int max = 0;
        for(int i = 0;i<num.length;i++) {
            if (num[i]==1) {
                count++;
            } else {
                count = 0;
            }
            if (count>max) {
                max = count;
            }
        }
        System.out.print(max);
    }
}

//LeetCode
class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count = 0;
        int max = 0;
        for (int i = 0;i<nums.length;i++) {
            if (nums[i]==1) {
                count++;
            } else{
                count = 0;
            }
            if (count>max) {
                max = count;
            }
        }
        return max;
    }
}