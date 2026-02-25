// 6.	Detect a Loop (Cycle): Determining if a linked list contains a cycle, also commonly solved with the slow and fast pointer method.
public class ProblemLinkedList6 {

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

    // Detect cycle using slow & fast pointer
    boolean detectLoop() {
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;          // move 1 step
            fast = fast.next.next;     // move 2 steps

            if (slow == fast) {
                return true; // loop found
            }
        }
        return false; // no loop
    }

    public static void main(String[] args) {
        ProblemLinkedList6 list = new ProblemLinkedList6();

        list.insert(1);
        list.insert(2);
        list.insert(3);
        list.insert(4);
        list.insert(5);

        // Create loop manually: 5 -> 3
        list.head.next.next.next.next.next = list.head.next.next;

        if (list.detectLoop()) {
            System.out.println("Loop Detected");
        } else {
            System.out.println("No Loop");
        }
    }
}