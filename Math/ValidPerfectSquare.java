import java.util.*;

class MainClass {
    public static void main(String args[]){
        int num = 14;
         for (int i = 1; ; i++) {
            if (i*i == num) {
                System.out.print("true");
                break;
            } 
            if (i*i>num) {
                System.out.print("false");
                break;
            }
        }
    }
}

//LeetCode
class Solution {
    public boolean isPerfectSquare(int num) {
       for (int i = 1; ;i++) {
        if ((long)i*i == num) {
            return true;
        }
        if ((long)i*i>num) {
            return false;
        }
       } 
    }
}