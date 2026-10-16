import java.util.*;

class IntersectionOfTwoArrays2 {
    public static void main(String args[]){
    int num1[] = {1,2,3,2,4};
    int num2[] = {2,4,5,6,2};
    List<Integer> result = new ArrayList<>();
    boolean[] used = new boolean[num2.length];

    for(int i = 0;i<num1.length;i++) {
      int num = num1[i];
            for (int j = 0;j<num2.length;j++) {
                if (num==num2[j]&&!used[j]) {
                    result.add(num);
                    used[j] = true;
                    break;
                }
            }
    }
 System.out.println(result);
    }
}

//LeetCode
class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        List<Integer> result = new ArrayList<>();
        boolean[] used = new boolean[nums2.length];
        for (int i = 0;i<nums1.length;i++) {
            int num = nums1[i];
            for (int j = 0;j<nums2.length;j++) {
                if (num==nums2[j]&&!used[j]) {
                    result.add(num);
                    used[j] = true;
                    break;
                }
            }
        }
        return result.stream().mapToInt(Integer::intValue).toArray(); 
    }
}