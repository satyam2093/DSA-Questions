// 8.	Add Two Numbers: Summing two numbers that are represented by linked lists, where each node contains a single digit and the digits are stored in reverse order.
public class ProblemLinkedList8 {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // Add two numbers represented by linked lists
    static Node addTwoNumbers(Node l1, Node l2) {
        Node dummy = new Node(0);
        Node temp = dummy;
        int carry = 0;

        while (l1 != null || l2 != null || carry != 0) {
            int sum = carry;

            if (l1 != null) {
                sum += l1.data;
                l1 = l1.next;
            }

            if (l2 != null) {
                sum += l2.data;
                l2 = l2.next;
            }

            carry = sum / 10;
            temp.next = new Node(sum % 10);
            temp = temp.next;
        }

        return dummy.next;
    }

    static void printList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        // 342 -> 2->4->3
        Node l1 = new Node(2);
        l1.next = new Node(4);
        l1.next.next = new Node(3);

        // 465 -> 5->6->4
        Node l2 = new Node(5);
        l2.next = new Node(6);
        l2.next.next = new Node(4);

        Node result = addTwoNumbers(l1, l2);
        printList(result);
    }
}