import java.util.*;

class MainClass {
    public static void main(String args[]) {
        int n = 17;
        if (n <= 0) {
            System.out.print("false");
            return;
        }
        while(n > 1) {
            while (n > 1) {
            if (n % 3 != 0) {
                System.out.println(false);
                return;
            }

            n = n / 3;
        }

        System.out.println(true);
        }
    }
}


//LeetCode
class Solution {
    public boolean isPowerOfThree(int n) {
        if (n <= 0) {
            return false;
        }

        while (n > 1) {
            if (n % 3 != 0) {
                return false;
            }

            n = n / 3;
        }

        return true;
    }
}
