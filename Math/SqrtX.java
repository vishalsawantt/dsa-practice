class Sqrtx {
    public static void main(String args[]) {
        int x = 8;
        int start = 1;
        int answer = 0;
        for(int i = start;i<=x;i++) {
            int root = i*i;
            if (root>x) {    
                break;
            }
            answer = i;
        }
        System.out.println(answer);
    }
}



//Leet Code

// class Solution {
//     public int mySqrt(int x) {
//         int answer = 0;
//         for (int i = 1;i<=x;i++) {
//             long root = (long)i*i;
//             if (root>x) {
//                 break;
//             }
//             answer = i;
//         }
//         return answer;
//     }
// }