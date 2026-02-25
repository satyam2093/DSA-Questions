// 11.	Swap Nodes in Pairs: Swapping adjacent nodes in the list without changing the data values, only the pointers.
public class ProblemLinkedList11 {

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

    // Swap nodes in pairs
    void swapPairs() {
        Node dummy = new Node(0);
        dummy.next = head;

        Node prev = dummy;

        while (prev.next != null && prev.next.next != null) {
            Node first = prev.next;
            Node second = first.next;

            // swapping pointers
            first.next = second.next;
            second.next = first;
            prev.next = second;

            // move prev two steps ahead
            prev = first;
        }

        head = dummy.next;
    }

    void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        ProblemLinkedList11 list = new ProblemLinkedList11();

        list.insert(1);
        list.insert(2);
        list.insert(3);
        list.insert(4);
        list.insert(5);

        list.swapPairs();
        list.display();
    }
}