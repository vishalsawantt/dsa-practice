import java.util.*;

class IntersectionOfTwoArrays {
    public static void main(String args[]){
    int num1[] = {1,2,3,4};
    int num2[] = {2,4,5,6};
    List<Integer> result = new ArrayList<>();

    for(int i = 0;i<num1.length;i++) {
      int num = num1[i];
            for (int j = 0;j<num2.length;j++) {
                if (num==num2[j] && !result.contains(num)) {
                    result.add(num);
                    break;
                }
            }
    }
 System.out.println(result);
    }
}

//LeetCode
class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        List<Integer> result = new ArrayList<>();
        for (int i = 0;i<nums1.length;i++) {
            int num = nums1[i];
            for (int j = 0;j<nums2.length;j++) {
                if (num==nums2[j]&&!result.contains(num)) {
                    result.add(num);
                    break;
                }
            }
        }
        return result.stream().mapToInt(Integer::intValue).toArray();
    }
}