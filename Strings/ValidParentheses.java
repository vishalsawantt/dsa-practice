import java.util.*;
class ValidParentheses {
    public static void main(String args[]) {
        String s1 = "[{}]";
        Stack<Character> stack = new Stack<>();
        
        for (int i = 0;i<s1.length();i++) {
            char c = s1.charAt(i);
            if (c =='('||c=='['||c=='{') {
                stack.push(c);
            } else {
                if (stack.isEmpty()) {
                    System.out.print(false);
                    return;
                }
                
                char last = stack.pop();
                if ((c == ')' && last != '(') ||
                    (c == ']' && last != '[') ||
                    (c == '}' && last != '{')) {
                        System.out.print(false);
                        return;
                    } 
            }
        }
                System.out.println(stack.isEmpty());

    }
}



// class Solution {
//     public boolean isValid(String s) {
//         Stack<Character> stack = new Stack<>();

//         for (int i = 0;i<s.length();i++) {
//             char c = s.charAt(i);

//             if (c=='(' || c=='[' || c=='{') {
//                 stack.push(c);
//             } else {
//                 if (stack.isEmpty()) {
//                     return false; 
//                 }

//             char last = stack.pop();

//             if ((c == ')' && last!='(') ||
//               (c== ']' && last!= '[') ||
//               (c=='}'&& last!= '{')) {
//                 return false;
//             }
//         }
//     }
//     return stack.isEmpty();
//     }
// }