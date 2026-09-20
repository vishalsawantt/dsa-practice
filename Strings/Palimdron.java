class MainClass {
    public static void main(String args[]) {
        String s = "madamd";
        boolean isPalin = true;
        
        for (int i = 0; i<s.length()/2;i++) {
            char c = s.charAt(i);
            if (c != s.length()-1) {
                isPalin = false;
                break;
            }
        }
        if (isPalin) {
            System.out.print("palindrome");
        } else {
            System.out.print("not-palindrome");
        }
    }
}


//LeetCode
// class Solution {
//     public boolean isPalindrome(String s) {
//         s = s.toLowerCase();
//         s = s.replaceAll("[^a-z0-9]", "");
//         String p = s.trim();
//         boolean isPalin = true;

//         for (int i = 0; i < p.length() / 2; i++) {
//             char c = p.charAt(i);

//             if (c != p.charAt(p.length() - 1 - i)) {
//                 isPalin = false;
//                 break;
//             }
//         }

//         if (isPalin) {
//             return true;
//         } else {
//             return false;
//         }
//     }
// }