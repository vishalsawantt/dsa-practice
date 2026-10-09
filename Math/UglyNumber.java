import java.util.*;

class UglyNumber {
    public static void main(String args[]) {
        int num = 18;
        
        if (num <= 0) {
            System.out.println(false);
            return;
        }
        while (num % 2 == 0) {
            num = num / 2;
        }

        while (num % 3 == 0) {
            num = num / 3;
        }

        while (num % 5 == 0) {
            num = num / 5;
        }
        System.out.println(num == 1);
    }
}

//LeetCode
class Solution {
    public boolean isUgly(int n) {
        if (n <= 0) {
            return false;
        }

        while (n % 2 == 0) {
            n = n / 2;
        }

        while (n % 3 == 0) {
            n = n / 3;
        }

        while (n % 5 == 0) {
            n = n / 5;
        }

        return n == 1;    
    }
}