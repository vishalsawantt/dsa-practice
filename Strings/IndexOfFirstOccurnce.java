package Strings;

class IndexOfFirstOccurnce  {
    public static void main(String args[]) {
       String s1 = "vishal";
       String s2 = "shaf";
       if (s1.contains(s2)) {
           int index = s1.indexOf(s2);
           System.out.print(index);
       } else {
           System.out.print(-1);
       }
    }
}



// class Solution {
//     public int strStr(String haystack, String needle) {
//         if (haystack.contains(needle)) {
//             int index = haystack.indexOf(needle);
//             return index;
//         } else {
//             return -1;
//         }
//     }
// }