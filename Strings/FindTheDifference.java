class MainClass {
    public static void main(String args[]) {
        String s = "abcd";
        String t = "abcde";
        int count[] = new int[26];

        // Count characters in s
        for (int  i = 0;i<s.length();i++) {
            count[s.charAt(i)-'a']++;
        }
        // Find the extra character in t
        for (int i = 0 ;i<t.length();i++) {
            int index = t.charAt(i) - 'a';
             if (count[index] == 0) {
                System.out.println(t.charAt(i));
                return;
            }

            count[index]--;
        }
    }
}


//Leetcode
class Solution {
    public char findTheDifference(String s, String t) {
      int count[] = new int[26];
      for (int i = 0;i<s.length();i++) {
        count[s.charAt(i) - 'a']++;
      }  
      for (int i = 0;i<t.length();i++) {
        int index = t.charAt(i) - 'a';

        if (count[index]==0) {
            return t.charAt(i);
        }
        count[index]--;
      }
      return ' ';
    }
}