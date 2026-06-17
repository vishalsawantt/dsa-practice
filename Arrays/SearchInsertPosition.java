package Arrays;

class SearchInsertPosition {
    public static void main(String args[]){
     int nums[] = {1,3,4,5,6,8};
     int val = 12;
     int index = nums.length; //6
     
     for (int i = 0;i<nums.length;i++) {
         if (nums[i] >= val) {
             index = i;
             break;
         }
     }
     System.out.print(index);
    }
}


// class Solution {
//     public int searchInsert(int[] nums, int target) {
//         int index = nums.length;
//         for (int i = 0;i<nums.length;i++) {
//             if (nums[i] >= target) {
//                 index = i;
//                 break;
//             }
//         }
//         return index;
//     }
// }
