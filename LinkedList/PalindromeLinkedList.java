import java.util.*;

class PalindromeLinkedList {
    public static void main(String args[]) {
        ListNode node = new ListNode(1);
        node.next = new ListNode(2);
        node.next.next = new ListNode(2);
        node.next.next.next = new ListNode(1);

        ListNode current = node;
        List<Integer> list = new ArrayList<>();
        while (current!=null) {
            list.add(current.val);
            current = current.next;
        }
        // List<Integer> reverse = new ArrayList<>(list);
        // Collections.reverse(reverse);
        // System.out.println(list.equals(reverse));
        boolean palindrome = true;
        int left = 0;
        int right = list.size()-1;
        while (left < right) {
            if (list.get(left) != list.get(right)) {
                palindrome = false;
                break;
            }
            left ++;
            right --;
        }
        System.out.print(palindrome);
    }
}

class ListNode {
    int val;
    ListNode next;
    ListNode(int val) {
        this.val = val;
        this.next = null;
    }
}


//LeetCode
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public boolean isPalindrome(ListNode head) {
        List<Integer> list = new ArrayList<>();
        ListNode current = head;
        while (current!=null) {
            list.add(current.val);
            current = current.next;
        }
        boolean palindrome = true;
        int left = 0;
        int right = list.size()-1;

        while (left < right) {
            if (list.get(left)!=list.get(right)) {
            palindrome = false;
            break;
        }
        left ++;
        right --;
        }
        return palindrome;
    }
}