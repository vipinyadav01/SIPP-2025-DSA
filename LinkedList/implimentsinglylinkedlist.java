// impliment the singly linked list in java
// This code is a simple implementation of a singly linked list in Java.
package LinkedList;

public class implimentsinglylinkedlist {
    private Node head;

    private static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public void insert(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    public void display() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        implimentsinglylinkedlist list = new implimentsinglylinkedlist();
        list.insert(1);
        list.insert(2);
        list.insert(3);
        list.display();
    }
    
}
