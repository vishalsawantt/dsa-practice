class RemoveDuplicates {
  public static void main(String args[]) {
    ListNode head = new ListNode(1);
    head.next = new ListNode(2);
    head.next.next = new ListNode(2);
    head.next.next.next = new ListNode(3);

    ListNode result = head;
    
    while (result!=null && result.next!=null) {
      // System.out.print(result.val + ",");
      // result = result.next;
      if (result.val == result.next.val) {
        result.next = result.next.next;
      } else {
        result = result.next;
      }
      }
    while (head != null) {
      System.out.print(head.val + ",");
      head = head.next;
    }
    }
  }


class ListNode {
  int val;
  ListNode next;

  ListNode(int val) {
    this.val = val;
  }
}

//Leetcode
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
// class Solution {
//     public ListNode deleteDuplicates(ListNode head) {
//         ListNode result = head;
//         while (head!=null && head.next!=null) {
//             if (head.val ==  head.next.val) {
//                 head.next = head.next.next;
//             } else {
//                  head = head.next;
//             }
//         }
//         return result;
//     }
// }