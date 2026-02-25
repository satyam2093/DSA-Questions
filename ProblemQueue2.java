// 2.	Reverse a Queue: Reverse the order of elements in a given queue, often using an auxiliary stack or recursion.


public class ProblemQueue2 {

    static class Queue {
        int[] arr = new int[100];
        int front = 0;
        int rear = -1;
        int size = 0;

        void enqueue(int x) {
            arr[++rear] = x;
            size++;
        }

        int dequeue() {
            if (isEmpty()) {
                return -1;
            }
            size--;
            return arr[front++];
        }

        boolean isEmpty() {
            return size == 0;
        }
    }

    // Recursive function to reverse queue
    public static void reverse(Queue q) {
        if (q.isEmpty()) {
            return;
        }

        int x = q.dequeue(); // remove front
        reverse(q);          // reverse remaining queue
        q.enqueue(x);        // add removed element at rear
    }

    public static void main(String[] args) {
        Queue q = new Queue();

        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.enqueue(40);

        reverse(q);

        // Print reversed queue
        while (!q.isEmpty()) {
            System.out.print(q.dequeue() + " ");
        }
    }
}