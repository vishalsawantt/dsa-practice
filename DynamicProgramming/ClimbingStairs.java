class ClimbingStairs {
  public static void main(String args[]) {
    int n = 5;
    int one = 1;
    int two = 2;
    
    if (n==1) {
      System.out.println(1);
    } else if (n == 2) {
      System.out.println(2);
    } else {
      for (int i = 3;i<=n;i++) {
    int current = one + two; 
      int tmp = one;
      one = current;
      two = tmp;
  }
    System.out.println(one);
    }}
}

// LeetCode
class Solution {
    public int climbStairs(int n) {
        if (n == 1) {
            return n;
        }
        if (n ==2) {
            return n;
        }
         int one = 1;
         int two = 2;
         for (int i = 3; i<=n; i++) {
            int current = one + two;
            one = two;
            two = current;
         }
         return two;
    }
}