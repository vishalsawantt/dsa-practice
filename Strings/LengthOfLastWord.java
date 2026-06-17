package Strings;
import java.util.Arrays;

class LengthOfLastWord {
    public static void main(String args[]) {
        String s1 = "hi jave is progrmming language";
        String s2[] = s1.split(" ");
        String s3 = s2[s2.length-1];
        //System.out.print(Arrays.toString(s2));
        //System.out.print(s3);
        int count = 0;
        for (int i = 0;i<s3.length();i++) {
            char c = s3.charAt(i);
            if (c!=' ') {
                count++;
            }
        }
        System.out.println(count);
        System.out.print(s3.length());
    }
}


// class Solution {
//     public int lengthOfLastWord(String s) {
//         String s2[] = s.split(" ");
//         String s3 = s2[s2.length-1];
//         int result = s3.length();
//         return result;
//     }
// }
