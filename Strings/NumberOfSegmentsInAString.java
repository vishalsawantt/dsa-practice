import java.util.*;
class MainClass {
    public static void main(String args[]) {
        String sen = "";
        
        sen = sen.trim();
        if (sen.isEmpty()) {
            System.out.print("0");
        } else {
            String words[] = sen.split(" ");
            System.out.print(words.length);
        }
    } 
}

//LeetCode
class Solution {
    public int countSegments(String s) {
        s = s.trim();
        if (s.isEmpty()) {
            return 0;
        } else {
            String words[] = s.split("\\s+");
            return words.length;
        }
    }
}