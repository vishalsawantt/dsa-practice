import java.util.*;

class MainClass {
    public static void main(String args[]) {
        int num[] = {2,5,6,8};
        int max = num[0];
        int smax = num[1];
        int tmax = num[2];
        for (int i = 0;i<num.length;i++) {
            if (num[i] == max || num[i] == smax || num[i] == tmax) {
                continue;
            }
            if (num[i]>max) {
                tmax = smax;
                smax = max;
                max = num[i];
            } else if (num[i]>smax) {
                tmax = smax;
                smax = num[i];
            } else if (num[i]>tmax) {
                tmax = num[i];
            }
            System.out.print(tmax);
        }
    }
}

//LeetCode
class Solution {
    public int thirdMax(int[] nums) {
        long max = Long.MIN_VALUE;
        long smax = Long.MIN_VALUE;
        long tmax = Long.MIN_VALUE;
        for (int i = 0;i<nums.length;i++) {
            if (nums[i] == max || nums[i] == smax || nums[i] == tmax) {
                continue;
            }
            if (nums[i] > max) {
                tmax = smax;
                smax = max;
                max = nums[i];
            } else if (nums[i] > smax) {
                tmax = smax;
                smax = nums[i];
            } else if (nums[i] > tmax) {
                tmax = nums[i];
            }
        }  
        if (tmax == Long.MIN_VALUE) {
            return (int) max;
        }
        return (int) tmax;
    }
}