package LinkedList;

class ListNode {
    int val;
    ListNode next;
    ListNode(int val) { this.val = val; }
}

public class MergeSortedLists {

    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        // Create a dummy node to start the merged list
        ListNode dummy = new ListNode(0);
        ListNode current = dummy;

        // Traverse both lists
        while (list1 != null && list2 != null) {
            if (list1.val <= list2.val) {
                current.next = list1;
                list1 = list1.next;
            } else {
                current.next = list2;
                list2 = list2.next;
            }
            current = current.next;
        }

        // Attach the remaining part
        if (list1 != null) current.next = list1;
        if (list2 != null) current.next = list2;

        return dummy.next; // Skip the dummy node
    }

    // Helper function to print the list
    public static void printList(ListNode head) {
        while (head != null) {
            System.out.print(head.val + " ");
            head = head.next;
        }
        System.out.println();
    }

    // Example usage
    public static void main(String[] args) {
        // Example: list1 = [1,2,4], list2 = [1,3,4]
        ListNode list1 = new ListNode(1);
        list1.next = new ListNode(2);
        list1.next.next = new ListNode(4);

        ListNode list2 = new ListNode(1);
        list2.next = new ListNode(3);
        list2.next.next = new ListNode(4);

        ListNode merged = mergeTwoLists(list1, list2);
        printList(merged);  // Output: 1 1 2 3 4 4
    }
}
