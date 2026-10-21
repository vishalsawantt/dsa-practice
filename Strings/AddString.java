class MainClass {
    public static void main(String args[]) {
        String num1 = "11";
        String num2 = "123";
        int i = num1.length()-1;
        int j = num2.length()-1;
        int carry = 0;
        StringBuilder result = new StringBuilder();
        
        while (i >= 0 || j >= 0 || carry > 0) {
            int digit1 = 0;
            int digit2 = 0;

            if (i >= 0) {
                digit1 = num1.charAt(i) - '0';
            }
            if (j >= 0) {
                digit2 = num2.charAt(j) - '0';
            }

            int sum = digit1 + digit2 + carry;
            result.append(sum % 10);
            carry = sum / 10;

            i--;
            j--;
        }
         result.reverse();

        System.out.println(result.toString());
    }
}


//LeetCode
class Solution {
    public String addStrings(String num1, String num2) {
        int i = num1.length()-1;
        int j = num2.length()-1;
        int carry = 0;
        StringBuilder result = new StringBuilder();

        while (i>=0 || j>=0 || carry>0) {
            int digit1 = 0;
            int digit2 = 0;
            if (i>=0) {
                digit1 = num1.charAt(i) - '0';
            }
            if (j>=0) {
                digit2 = num2.charAt(j) - '0';
            }
            int sum = digit1 +digit2 + carry;
            result.append(sum%10);
            carry = sum/10;
            i--;
            j--;
        }
        return result.reverse().toString();
    }
}