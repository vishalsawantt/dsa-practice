package Strings;

import java.util.*;

class longestCommonPrefix {
    public static void main(String args[]) {
        List<String> s1 = Arrays.asList("smad", "smsfs", "smadf");

        String first = s1.get(0);
        String result = "";

        for (int i = 0; i < first.length(); i++) {
            char f = first.charAt(i);
            boolean isMatch = true;

            for (int j = 1; j < s1.size(); j++) {
                String current = s1.get(j);

                if (i >= current.length() || current.charAt(i) != f) {
                    isMatch = false;
                    break;
                }
            }

            if (isMatch) {
                result += f;
            } else {
                break;
            }
        }

        System.out.println(result);
    }
}



// class Solution {
//     public String longestCommonPrefix(String[] strs) {

//         String first = strs[0];
//         String result = "";

//         for (int i = 0; i < first.length(); i++) {
//             char ch = first.charAt(i);

//             for (int j = 1; j < strs.length; j++) {
//                 String current = strs[j];

//                 if (i >= current.length() || current.charAt(i) != ch) {
//                     return result;
//                 }
//             }
//             result += ch; 
//         }
//         return result;
//     }
// }
