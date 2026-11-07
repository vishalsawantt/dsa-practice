import java.util.*;

class MainClass {
    public static void main(String args[]) {
       int nums[] = {1,2,2,4};
        boolean[] seen = new boolean[nums.length+1];
        int duplicate = 0;
        int missing = 0;
        for (int num : nums) {
            if (seen[num]) {
                duplicate = num;
            } else {
                seen[num] = true;
            }
            for (int i = 1; i <= nums.length; i++) {

            if (!seen[i]) {
                missing = i;
            }
        }
        System.out.println("Duplicate: " + duplicate);
        System.out.println("Missing: " + missing);
        System.out.println(Arrays.toString(new int[]{duplicate, missing}));
        }
    }
}

//LeetCode
class Solution {
    public int[] findErrorNums(int[] nums) {

        boolean[] seen = new boolean[nums.length + 1];

        int duplicate = 0;
        int missing = 0;

        for (int num : nums) {
            if (seen[num]) {
                duplicate = num;
            } else {
                seen[num] = true;
            }
        }

        for (int i = 1; i <= nums.length; i++) {
            if (!seen[i]) {
                missing = i;
            }
        }

        return new int[] {duplicate, missing};
    }
}
