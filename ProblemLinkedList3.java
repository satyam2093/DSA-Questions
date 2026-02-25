// 3.	Nth Node from the End: Finding the Nth node from the end of the list, often using two pointers separated by N nodes.
public class ProblemLinkedList3 {

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

    // Find Nth node from end
    void findNthFromEnd(int n) {
        Node slow = head;
        Node fast = head;

        // Move fast n steps ahead
        for (int i = 0; i < n; i++) {
            if (fast == null) {
                System.out.println("List is shorter than " + n);
                return;
            }
            fast = fast.next;
        }

        // Move both pointers
        while (fast != null) {
            slow = slow.next;
            fast = fast.next;
        }

        System.out.println("Nth Node from End: " + slow.data);
    }

    public static void main(String[] args) {
        ProblemLinkedList3 list = new ProblemLinkedList3();

        list.insert(1);
        list.insert(2);
        list.insert(3);
        list.insert(4);
        list.insert(5);

        list.findNthFromEnd(5);
    }
}