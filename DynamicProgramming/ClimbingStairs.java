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