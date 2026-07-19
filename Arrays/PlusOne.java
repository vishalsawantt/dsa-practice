class plusOne {
    public int[] plusOne(int[] digits) {
        int len = digits.length;
        for (int i = len - 1;i >= 0;i--) {
            if (digits[i]<9) {
                digits[i] = digits[i] + 1;
                return digits;
            } else {
                digits[i] = 0;
            }
        }
        int[] result = new int[len + 1];
        result[0] = 1;
        return result;
    }
}


// import java.util.Arrays;
// import java.util.Arrays;

// class MainClass {
//     public static void main(String args[]) {
//         int arr[] = {9};
//         int len = arr.length;
//         for (int i = len -1;i>=0;i--) {
//             if (arr[i]<9) {
//                 arr[i] = arr[i]+1;
//                 break;
//             } else {
//                 arr[i] = 0;
//             }
//         }
//         System.out.print(Arrays.toString(arr));
//     }
// }