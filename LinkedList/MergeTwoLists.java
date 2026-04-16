class MergeTwoLists {
    public static void main(String args[]) {
        ListNode first = new ListNode(1);
        first.next = new ListNode(3);
        first.next.next = new ListNode(4);
        
        ListNode second = new ListNode(1);
        second.next = new ListNode(2);
        second.next.next = new ListNode(4);

        ListNode dummy = new ListNode(0);
        ListNode merged = dummy;
        
        ListNode l1 = first;
        ListNode l2 = second;
        
        while (l1 != null && l2 != null) {
            if (l1.val<l2.val) {
                merged.next = l1;
                l1 = l1.next;
            } else {
                merged.next = l2;
                l2 = l2.next;
            }
            merged = merged.next;
        }
        
        if (l1 != null) {
            merged.next = l1;
        } else {
            merged.next = l2;
        }

        
        ListNode forPrint = dummy;
        while (forPrint!=null) {
            System.out.print(forPrint.val + " ");
            forPrint = forPrint.next;
        }
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



/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 
class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode l1 = list1;
        ListNode l2 = list2;

        ListNode dummy = new ListNode(0);
        ListNode merge = dummy;

        while (l1!=null&&l2!=null) {
            if (l1.val<l2.val) {
                merge.next = l1;
                l1 = l1.next;
            } else {
                merge.next = l2;
                l2 = l2.next;
            }
            merge = merge.next;
        }  
         if (l1 != null) {
            merge.next = l1;
        } else {
            merge.next = l2;
        }
        return dummy.next;
    }
}
*/