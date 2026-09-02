class AddBinary {
    public static void main(String args[]) {
        String a = "11";
        String b = "1";

        int i = a.length()-1; // 1
        int j = b.length()-1; //0
        int carry = 0;

        StringBuilder result = new StringBuilder(); //0

        while (i>=0 || j>=0 || carry!=0) { //1>=0:0>=0;0 ,0>=0:-1>=0:0
            int digitA = 0;
            int digitB = 0;

            if (i>=0) { //1>0, 0=0
                digitA = a.charAt(i) - '0'; //1(index) = 1, 0(index) = 1
            }
            if (j>=0) {
                digitB = b.charAt(j) - '0'; //0(index) = 1, -1(index) = empty
            }

            int sum = digitA + digitB + carry; //1+1+0=2 , 
            result.append(sum%2); //2%2=0
            carry = sum / 2; //2/2=1

            i--; //0
            j--; //-1
        }

        System.out.println(result.reverse().toString());
    }
}

// class addBinary {
//     public String addBinary(String a, String b) {
//         int i = a.length() - 1;
//         int j = b.length() - 1;
//         int carry = 0;

//         StringBuilder result = new StringBuilder();
//         while (i >= 0 || j >= 0 || carry != 0) {
//             int digitA = 0;
//             int digitB = 0;

//             if (i >= 0) {
//                 digitA = a.charAt(i) - '0';
//             }
//             if (j >= 0) {
//                 digitB = b.charAt(j) - '0';
//             }
//             int sum = digitA + digitB + carry;
//             result.append(sum % 2);
//             carry = sum / 2;
//             i--;
//             j--;
//         }
//         return result.reverse().toString();
//     }
// }