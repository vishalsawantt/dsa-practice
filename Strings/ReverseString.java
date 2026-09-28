class MainClass {
    public static void main(String args[]) {
        char[] arr = {'h', 'e', 'l', 'l', 'o'};
        reverseString(arr);
        System.out.print(arr);
    }
    static void reverseString(char[] s) {
        int left = 0;
        int right = s.length - 1;
        while (left < right) {
            char temp = s[left];
            s[left] = s[right];
            s[right] = temp;

            left++;
            right--;
        }
    }
}


//LeetCode
class Solution {
    public void reverseString(char[] s) {
        int left = 0;
        int right = s.length-1;

        while(left<right) {
            char temp = s[left];
            s[left] = s[right];
            s[right] = temp;
            left++;
            right--;
        } 
    }
}