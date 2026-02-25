
// 1.	Reverse a Linked List: The classic problem of reversing the direction of the links, typically in-place using iterative or recursive approaches.
public class ProblemLinkedList1 {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    Node head;

    public void insertAtEnd(int data) {
        Node newNode = new Node(data);
        Node temp = head;
        if (head == null) {
            head = newNode;
            return;

        }
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;

    }

    public void display() {
        if (head == null) {
            System.out.println("Linked List is empty");
        }
        Node temp = head;
        while (temp != null) {
            
            System.out.print(temp.data + " ->");
            temp=temp.next;

        }
        System.out.println(" ");
    }

    public void reverse() {
        Node prev = null;
        Node temp = head;
        Node next;
        while (temp != null) {
            next = temp.next;
            temp.next = prev;

            prev = temp;
            temp = next;
        }
        head=prev;
    }

        
     public static void main(String[] args){
        ProblemLinkedList1 sll = new ProblemLinkedList1();
        sll.insertAtEnd(18);
        sll.insertAtEnd(19);
        sll.insertAtEnd(25);
        sll.insertAtEnd(29);
        sll.insertAtEnd(39);
        sll.display();
        sll.reverse();
        sll.display();

     }


    
}
