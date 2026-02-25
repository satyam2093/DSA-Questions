// 10.	Intersection Point of Two Linked Lists: Finding the specific node where two separate linked lists begin to intersect and share a common tail
public class ProblemLinkedList10 {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // Find intersection node
    static Node getIntersection(Node headA, Node headB) {
        Node p1 = headA;
        Node p2 = headB;

        while (p1 != p2) {
            p1 = (p1 == null) ? headB : p1.next;
            p2 = (p2 == null) ? headA : p2.next;
        }
        return p1; // intersection node or null
    }

    public static void main(String[] args) {

        // Common part: 4 -> 5
        Node common = new Node(4);
        common.next = new Node(5);

        // List A: 1->2->3->4->5
        Node headA = new Node(1);
        headA.next = new Node(2);
        headA.next.next = new Node(3);
        headA.next.next.next = common;

        // List B: 9->8->4->5
        Node headB = new Node(9);
        headB.next = new Node(8);
        headB.next.next = common;

        Node intersection = getIntersection(headA, headB);

        if (intersection != null) {
            System.out.println("Intersection at node: " + intersection.data);
        } else {
            System.out.println("No Intersection");
        }
    }
}