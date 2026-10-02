class HappyNumber {
    public static void main(String args[]) {
        int n = 19;
        int sum = 0;
        while (n > 0) {
            int digit = n % 10;
            sum = sum + digit * digit;
            n = n / 10;
        }
        System.out.print(sum);
    }
}


//LeetCode
class Solution {
    public boolean isHappy(int n) {
       HashSet<Integer> set = new HashSet<>();
       while (n != 1) {
        if (set.contains(n)) {
            return false;
        }
        set.add(n);
        int sum = 0;
        while (n > 0) {
                int digit = n % 10;
                sum = sum + digit * digit;
                n = n / 10;
            }
            n = sum;
       } 
       return true;
    }
}