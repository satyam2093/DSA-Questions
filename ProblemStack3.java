// 3.	Implement Stack/Queue using the other: Building one data structure using the operations of the other (e.g., implementing a queue using two stacks or a stack using queues).

public class ProblemStack3 {

    int size = 100;
    int[] stack1 = new int[size];
    int[] stack2 = new int[size];
    int top1 = -1;
    int top2 = -1;

    // Enqueue operation
    public void enqueue(int x) {
        if (top1 == size - 1) {
            System.out.println("Queue Overflow");
            return;
        }
        stack1[++top1] = x;
    }

    // Dequeue operation
    public int dequeue() {
        if (top1 == -1 && top2 == -1) {
            System.out.println("Queue Underflow");
            return -1;
        }

        // Move elements only if stack2 is empty
        if (top2 == -1) {
            while (top1 != -1) {
                stack2[++top2] = stack1[top1--];
            }
        }

        return stack2[top2--];
    }

    public static void main(String[] args) {
        ProblemStack3 q = new ProblemStack3();

        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);

        System.out.println(q.dequeue()); // 10
        System.out.println(q.dequeue()); // 20

        q.enqueue(40);

        System.out.println(q.dequeue()); // 30
        System.out.println(q.dequeue()); // 40
    }
}