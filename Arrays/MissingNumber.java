import java.util.*;

class MainClass {
    public static void main(String args[]) {
        int num[] = {0,1,3};
        for (int i = 0; i<num.length;i++) {
            boolean found = false;
            for (int j = 0; j<num.length;j++) {
                if (num[j]==i) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                System.out.print(i);
                break;
            }
        }
    }
}


//LeetCode
class Solution {
    public int missingNumber(int[] nums) {
        for (int i = 0; i<nums.length;i++) {
            boolean found = false;
            for (int j = 0;j<nums.length;j++) {
                if (nums[j]==i) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                return i;
                break;
            }
        }
    }
}