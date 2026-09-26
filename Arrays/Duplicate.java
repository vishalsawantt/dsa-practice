class MainClass {
    public static void main(String args[]) {
        int arr[] = {1,2,3,1};
        boolean dup = false;
        for (int i = 0;i<arr.length;i++) {
            for (int j = i+1; j<arr.length;j++) {
                if (arr[i]==arr[j]) {
                    dup = true;
                    break;
                }
            }
            if (dup) {
                break;
            }
        }
        if (dup) {
            System.out.print("true");
        } else {
            System.out.print("false");
        }
    }
}

//LeetCode
class Solution {
    public boolean containsDuplicate(int[] nums) {
        boolean dup = false;
        for (int i = 0;i<nums.length;i++) {
            for (int j = i+1;j<nums.length;j++) {
                if (nums[i]==nums[j]) {
                    dup = true;
                    break;
                }
            }
            if (dup) {
                break;
            }
        }
        if (dup) {
            return true;
        } else {
            return false;
        }
    }
}

//leetcode performance
class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0;i<nums.length;i++) {
            if (set.contains(nums[i])) {
                return true;
            }
            set.add(nums[i]);
        }
        return false;
    }
}