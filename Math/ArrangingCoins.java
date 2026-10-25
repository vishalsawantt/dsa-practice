import java.util.*;

class MainClass {
    public static void main(String args[]) {
        int n = 5;
        int row = 1;
        int count = 0;
        while (n>=row) {
            n = n - row;
            count++;
            row++;
        }
        System.out.print(count);
    }
}


//LeetCode
class Solution {
    public int arrangeCoins(int n) {
        int row = 1;
        int count = 0;

        while(n>=row) {
            n = n - row;
            count++;
            row++;
        }
        return count;
    }
}