// 4.	Remove Duplicates from a Sorted Linked List: Iterating through a sorted list and removing nodes with the same value as their predecessor. 
public class ProblemLinkedList4 {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    Node head;

    void insert(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }

    // Remove duplicates from sorted linked list
    void removeDuplicates() {
        Node current = head;

        while (current != null && current.next != null) {
            if (current.data == current.next.data) {
                current.next = current.next.next; // skip duplicate
            } else {
                current = current.next; // move forward
            }
        }
    }

    void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        ProblemLinkedList4 list = new ProblemLinkedList4();

        list.insert(1);
        list.insert(1);
        list.insert(2);
        list.insert(3);
        list.insert(3);
        list.insert(4);
        list.insert(4);
        list.insert(5);
        list.display();
        System.out.println();

        list.removeDuplicates();
        list.display();
    }
}