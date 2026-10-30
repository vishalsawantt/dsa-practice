import java.util.*;

class InsertionSortList {
    public static void main(String args[]) {
        ListNode l1 = new ListNode(1);
        l1.next = new ListNode(3);
        l1.next.next = new ListNode(5);
        l1.next.next.next = new ListNode(4);

        ListNode dummy = new ListNode(0);
        ListNode current = l1;  //1

        while (current!=null) {
            ListNode nextNode = current.next; //3
            ListNode previous = dummy; //0
            while (previous.next!=null && previous.next.val<current.val) {
                previous = previous.next;
            }
            current.next = previous.next;
            previous.next = current;
            current = nextNode;
        }
        ListNode result = dummy.next;
        while (result!=null) {
            System.out.print(result.val + " ->");
            result = result.next;
        }
    }
}

class ListNode{
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
    public ListNode insertionSortList(ListNode head) {
        ListNode dummy = new ListNode(0);
        ListNode current = head;
        while (current != null) {
            ListNode nextNode = current.next;
            ListNode previous = dummy;
            while (previous.next != null &&
                   previous.next.val < current.val) {
                previous = previous.next;
            }
            current.next = previous.next;
            previous.next = current;
            current = nextNode;
        }
        return dummy.next;
    }
}