import java.util.*;

class MainClass {
    public static void main(String args[]){
        int num = 10;
        int pick = 6;
        int left = 1;
        int right = num;
        while (left < right) {
            int mid = left + (right-left)/2;
            if (mid==pick) {
                System.out.print(mid);
                return;
            } else if (mid > pick){
                right = mid - 1;
            } else {
                left = mid +1;
            }
        }
    }
}


//LeetCode
/** 
 * Forward declaration of guess API.
 * @param  num   your guess
 * @return 	     -1 if num is higher than the picked number
 *			      1 if num is lower than the picked number
 *               otherwise return 0
 * int guess(int num);
 */

public class Solution extends GuessGame {
    public int guessNumber(int n) {
        int left = 1;
        int right = n;
        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (guess(mid) == 0) {
                return mid;
            } else if (guess(mid) == -1) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return -1;
    }
}