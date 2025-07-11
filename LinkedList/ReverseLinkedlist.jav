//Reaverse the linked list in java
// This code reverses a singly linked list in Java.
public class  ReaverseLinkedlist {
     public ListNode reverseList(ListNode head) {
        ListNode prev =null;
        ListNode curr = head;
        ListNode tmp = null;
        while (curr != null){
            tmp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = tmp;
        }
        return prev;
        
    }
}