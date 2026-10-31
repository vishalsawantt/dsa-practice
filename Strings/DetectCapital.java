import java.util.*;


class MainClass {
    public static void main(String args[]) {

        String s = "USA";

        if (s.equals(s.toUpperCase())) {
            System.out.println(true);
        }
        else if (s.equals(s.toLowerCase())) {
            System.out.println(true);
        }
        else if (Character.isUpperCase(s.charAt(0)) &&
                 s.substring(1).equals(s.substring(1).toLowerCase())) {
            System.out.println(true);
        }
        else {
            System.out.println(false);
        }
    }
}


//LeetCode
class Solution {
    public boolean detectCapitalUse(String word) {
        if(word.equals(word.toUpperCase())) {
            return true;
        } 

        if(word.equals(word.toLowerCase())) {
            return true;
        }
        else if (Character.isUpperCase(word.charAt(0)) &&
                 word.substring(1).equals(word.substring(1).toLowerCase())) {
            return true;
        }
        else {
            return false;
        }
    }
}