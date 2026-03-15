package Arrays;

import java.util.Arrays;

public class MedianOfArrays {
    public static void main(String args[]) {
        int arro[] = {1,2};
        int arrt[] = {3,4};
        int finala[] = new int[arro.length+arrt.length];
        
        for (int i = 0;i<arro.length;i++) {
            finala[i] = arro[i];
        }
        for (int j = 0;j<arrt.length;j++) {
            finala[arro.length+j] = arrt[j];
        }
        Arrays.sort(finala);
        
        int l = finala.length;
        if (l%2==1) {
            System.out.print(finala[l/2]);
        } else {
            System.out.print((finala[l/2-1] + finala[l/2])/2.0);
        }
    }
}


// public class MedianOfArrays {

//     public double findMedianSortedArrays(int[] arro, int[] arrt) {
//         int[] arrf = new int[arro.length + arrt.length];

//         for (int i = 0; i < arro.length; i++) {
//             arrf[i] = arro[i];
//         }

//         for (int j = 0; j < arrt.length; j++) {
//             arrf[arro.length + j] = arrt[j];
//         }

//         Arrays.sort(arrf);

//         int l = arrf.length;

//         if (l % 2 == 1) {
//             return arrf[l / 2];
//         } else {
//             return (arrf[l/2 - 1] + arrf[l/2]) / 2.0;
//         }
//     }

//     public static void main(String[] args) {

//         int nums1[] = {1,2};
//         int nums2[] = {3,4};

//         MedianOfArrays obj = new MedianOfArrays();

//         double result = obj.findMedianSortedArrays(nums1, nums2);

//         System.out.println("Median = " + result);
//     }
// }