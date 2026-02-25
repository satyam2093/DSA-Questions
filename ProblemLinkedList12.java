// 12.	Partition List: Given a value x, rearranging the list so all nodes less than x come before all nodes greater than or equal to x.
public class ProblemLinkedList12 {
    

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node partition(Node head, int x) {
        Node beforeHead = new Node(0);
        Node before = beforeHead;
        Node afterHead = new Node(0);
        Node after = afterHead;

        Node curr = head;

        while (curr != null) {
            if (curr.data < x) {
                before.next = curr;
                before = before.next;
            } else {
                after.next = curr;
                after = after.next;
            }
            curr = curr.next;
        }

        after.next = null;          // Important to avoid cycle
        before.next = afterHead.next;

        return beforeHead.next;
    }

    public static void printList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(4);
        head.next.next = new Node(3);
        head.next.next.next = new Node(2);
        head.next.next.next.next = new Node(5);
        head.next.next.next.next.next = new Node(2);

        int x = 3;
        Node result = partition(head, x);
        printList(result);
    }
}