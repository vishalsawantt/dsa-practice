import java.util.*;

class SummaryRanges {
    public static void main(String args[]) {
        int arr[] = {1,2,3,4,6,7,9};
        int start = 0;
        List<String> result = new ArrayList<>();
        
        for (int i = 0;i<arr.length-1;i++) {
            if (arr[i]+1 == arr[i+1]) {
                
            }
            else {
                if (start == i) {
                    result.add(String.valueOf(arr[start]));
                } else {
                    result.add(arr[start] + "->" + arr[i]);
                }
                start = i + 1;
            }
        }
        if (start == arr.length - 1) {
            result.add(String.valueOf(arr[start]));
        } else {
            result.add(arr[start] + "->" + arr[arr.length - 1]);
        }

        System.out.println(result);
    }
}


//LeetCode
class Solution {
    public List<String> summaryRanges(int[] nums) {
        int start = 0;
        List<String> result = new ArrayList<>();

        if (nums.length == 0) {
            return result;
        }

        for (int i = 0; i<nums.length-1;i++) {
            if (nums[i] + 1 == nums[i+1]) {

            } else {
                if (start == i) {
                    result.add(String.valueOf(nums[start]));
                } else {
                    result.add(nums[start] + "->" + nums[i]);
                }
                start = i+1;
            }
        }
        if (start == nums.length-1) {
            result.add(String.valueOf(nums[start]));
        } else  {
            result.add(nums[start] + "->" + nums[nums.length - 1]);
        }
        return result;
    }
}