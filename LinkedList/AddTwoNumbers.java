package LinkedList;

class MainClass {
    public static void main(String args[]) {
        ListNode l1 = new ListNode(3);
        l1.next = new ListNode(4);
        l1.next.next = new ListNode(2);
        
        ListNode l2 = new ListNode(4);
        l2.next = new ListNode(6);
        l2.next.next = new ListNode(5);
        
        ListNode dummy = new ListNode(0);
        ListNode current = dummy;
        
        int carry = 0;
        
        while(l1!=null || l2!=null || carry!=0) {
            int sum = carry;
            if (l1!=null) {
                sum+=l1.val;
                l1 = l1.next;
            }
            if (l2!=null) {
                sum+=l2.val;
                l2 = l2.next;
            }
            carry = sum/10;
            current.next = new ListNode(sum%10);
            current = current.next;
        }
        // print result
        ListNode result = dummy.next;
        while (result != null) {
            System.out.print(result.val + " ");
            result = result.next;
        }
    }
}

class ListNode{
    int val;
    ListNode next;
    
    ListNode(int val) {
        this.val=val;
        this.next=null;
    }
}