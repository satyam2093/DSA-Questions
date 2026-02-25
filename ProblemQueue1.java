// 1.	Implement Queue using Stacks: Design a queue data structure using only stacks to store the elements.

public class ProblemQueue1{

    static class Queue {
        int[] stack1 = new int[100];
        int[] stack2 = new int[100];
        int top1 = -1;
        int top2 = -1;

        // push into stack1
        void enqueue(int x) {
            stack1[++top1] = x;
            System.out.println(x + " inserted");
        }

        // pop from stack2 (queue remove)
        int dequeue() {
            if (top2 == -1) {
                // move all elements from stack1 to stack2
                while (top1 != -1) {
                    stack2[++top2] = stack1[top1--];
                }
            }

            if (top2 == -1) {
                System.out.println("Queue is empty");
                return -1;
            }

            return stack2[top2--];
        }

        int peek() {
            if (top2 == -1) {
                while (top1 != -1) {
                    stack2[++top2] = stack1[top1--];
                }
            }

            if (top2 == -1) {
                System.out.println("Queue is empty");
                return -1;
            }

            return stack2[top2];
        }
    }

    public static void main(String[] args) {
        Queue q = new Queue();

        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);

        System.out.println("Front element: " + q.peek());
        System.out.println("Removed: " + q.dequeue());
        System.out.println("Removed: " + q.dequeue());
        System.out.println("Front element: " + q.peek());
    }
}