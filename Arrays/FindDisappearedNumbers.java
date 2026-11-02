import java.util.*;

class MainClass {
    public static void main(String args[]) {
        int nums[] = {4,3,2,7,8,2,3,1};
        boolean[] seen = new boolean[nums.length+1];
        for (int num : nums) {
            seen[num] = true;
        }
        ArrayList<Integer> result = new ArrayList<>();
        for (int i = 1;i<=nums.length;i++) {
            if (!seen[i]) {
                result.add(i);
            }
        }
        System.out.print(result);
    }
}

//LeetCode
class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        boolean[] seen = new boolean[nums.length+1];
        for (int num : nums) {
            seen[num] = true;
        }

        ArrayList<Integer> result = new ArrayList<>();

        for (int i = 1;i<=nums.length;i++) {
            if (!seen[i]) {
                result.add(i);
            }
        }
        return result;
    }
}