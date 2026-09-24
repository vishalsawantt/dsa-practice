class MejorityElement {
    public static void main(String args[]) {

        int arr[] = {2,2,1,1,1,2,2};

        for (int i = 0; i < arr.length; i++) {

            int count = 0;

            for (int j = 0; j < arr.length; j++) {

                if (arr[i] == arr[j]) {
                    count++;
                }
            }

            if (count > arr.length / 2) {
                System.out.println(arr[i]);
                break;
            }
        }
    }
}

//LeetCode
class Solution {
    public int majorityElement(int[] nums) {
        for (int i = 0;i<nums.length;i++) {
            int count = 0;
            for (int j = 0;j<nums.length;j++) {
                if (nums[i] == nums[j]) {
                    count++;
                }
            }
            if (count>nums.length/2) {
                return nums[i];
            }
        }   
        return -1;
    }
}