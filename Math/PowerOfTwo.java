class PowerOfTwo {
    public static void main(String args[]) {
        int n = 8;
        if (n > 0) {
            while (n > 1) {
                n = n / 2;
            }
            if (n == 1) {
                System.out.print(true);
            } else {
                System.out.print(false);
            }
        }
    }
}

//LeetCode
class Solution {
    public boolean isPowerOfTwo(int n) {
        if (n <= 0) {
            return false;
        }
        while (n > 1) {
         if (n%2 != 0) {
            return false;
         }
         n = n /2;
        }
        return true;
    }
}