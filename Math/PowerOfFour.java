import java.util.*;

class MainClass {
    public static void main(String args[]) {
        int n = 16;
        if (n <= 0) {
            System.out.print("false");
            return;
        }
        while(n > 1) {
            if (n % 4 != 0) {
                System.out.println(false);
                return;
        }
            n = n / 4;
        }
        System.out.println(true);
    }
}

//LeetCode
class Solution {
    public boolean isPowerOfFour(int n) {
        if (n<=0) {
            return false;
        } 
        while(n>0) {
            if (n%4!=0) {
                return false;
            }
            n = n/4;
        }
        return true;
    }
}