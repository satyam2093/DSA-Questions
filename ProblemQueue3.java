// 3.	Reverse First K Elements of a Queue: Reverse only the first k elements of the queue, leaving the rest in the same relative order.
public class ProblemQueue3 {

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
            if (isEmpty()) return -1;
            size--;
            return arr[front++];
        }

        boolean isEmpty() {
            return size == 0;
        }

        int getSize() {
            return size;
        }
    }

    // Reverse first K elements
    public static void reverseFirstK(Queue q, int k) {
        if (k <= 0 || k > q.getSize()) return;

        int[] temp = new int[k];

        // Step 1: Remove first k elements
        for (int i = 0; i < k; i++) {
            temp[i] = q.dequeue();
        }

        // Step 2: Add them back in reverse order
        for (int i = k - 1; i >= 0; i--) {
            q.enqueue(temp[i]);
        }

        // Step 3: Move remaining elements to back
        int remaining = q.getSize() - k;
        for (int i = 0; i < remaining; i++) {
            q.enqueue(q.dequeue());
        }
    }

    public static void main(String[] args) {
        Queue q = new Queue();

        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.enqueue(40);
        q.enqueue(50);

        int k = 3;
        reverseFirstK(q, k);

        // Print result
        while (!q.isEmpty()) {
            System.out.print(q.dequeue() + " ");
        }
    }
}