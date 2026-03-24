package Strings;


class RomanToInteger {
    public static void main(String args[]) {
       String s1 = "III";
       int result = 0;
       for (int i = 0;i<s1.length();i++) {
           int currentValue = getValue(s1.charAt(i));
           if(i+1<s1.length()) {
               int nextValue = getValue(s1.charAt(i+1));
               
               if(currentValue<nextValue) {
                   result -= currentValue;
               } else {
                   result +=currentValue;
               }
           } else {
               result += currentValue;
           }
       }
       System.out.println("Answer:  " + result);
    }
    
    static int getValue(char c) {
        if (c == 'I') return 1;
        if (c == 'V') return 5;
        if (c == 'X') return 10;
        if (c == 'L') return 50;
        if (c == 'C') return 100;
        if (c == 'D') return 500;
        if (c == 'M') return 1000;
        return 0;
    }
}


// LeetCode Soultion:
// class Solution {
//     public int romanToInt(String s) {
//         int result = 0;
//         for (int i = 0;i<s.length();i++) {
//             int fromLeft = getValue(s.charAt(i));

//            if (i+1<s.length()){
//             int nextValue = getValue(s.charAt(i+1));

//             if(fromLeft < nextValue) {
//                 result -= fromLeft;
//             } else {
//                 result += fromLeft;
//             }
//            } else {
//             result += fromLeft;
//            }
//         }
//         return result;
//     }

//     static int getValue(char c) {
//         if (c == 'I') return 1;
//         if (c == 'V') return 5;
//         if (c == 'X') return 10;
//         if (c == 'L') return 50;
//         if (c == 'C') return 100;
//         if (c == 'D') return 500;
//         if (c == 'M') return 1000;
//         return 0;
//     }
// }