import java.util.*;

class MainClass {
    public static void main(String args[]) {
        String sen = "ab-g-g-d-s";
        int key = 2;

        sen = sen.replace("-", "").toUpperCase();

        StringBuilder result = new StringBuilder();
        int count = 0;

        for (int i = sen.length() - 1; i >= 0; i--) {
            if (count == key) {
                result.append("-");
                count = 0;
            }

            result.append(sen.charAt(i));
            count++;
        }

        System.out.println(result.reverse().toString());
    }
}

//LeetCode
class Solution {
    public boolean repeatedSubstringPattern(String s) {
        int n = s.length();

        for (int i = 1; i <= n / 2; i++) {
            if (n % i == 0) {
                String sub = s.substring(0, i);
                StringBuilder result = new StringBuilder();

                for (int j = 0; j < n / i; j++) {
                    result.append(sub);
                }

                if (result.toString().equals(s)) {
                    return true;
                }
            }
        }

        return false;
    }
}