// 2.	Find the Middle Element: Efficiently finding the middle node, often solved using the slow and fast pointer (tortoise and hare) technique to achieve this in a single pass.

public class ProblemLinkedList2 {

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

    // Find middle using slow & fast pointer
    void findMiddle() {
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;        // move 1 step
            fast = fast.next.next;   // move 2 steps
        }

        System.out.println("Middle Element: " + slow.data);
    }

    public static void main(String[] args) {
        ProblemLinkedList2 list = new ProblemLinkedList2();

        list.insert(1);
        list.insert(2);
        list.insert(3);
        list.insert(4);
        list.insert(5);

        list.findMiddle();
    }
}