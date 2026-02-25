// 6.	First Negative Integer in Every Window of Size K: Find the first negative integer in each window of a given size in an array.

public class ProblemQueue6 {

    static class Queue {
        int[] q = new int[100];
        int front = 0, rear = -1;

        void enqueue(int x) {
            q[++rear] = x;
        }

        void dequeue() {
            front++;
        }

        boolean isEmpty() {
            return front > rear;
        }

        int peek() {
            return q[front];
        }
    }

    public static void firstNegative(int[] arr, int k) {
        int n = arr.length;
        Queue q = new Queue();

        // Process first window
        for (int i = 0; i < k; i++) {
            if (arr[i] < 0) {
                q.enqueue(i); // store index
            }
        }

        // Process remaining windows
        for (int i = k; i <= n; i++) {

            // Print result for current window
            if (q.isEmpty()) {
                System.out.print("0 ");
            } else {
                System.out.print(arr[q.peek()] + " ");
            }

            // Remove elements out of this window
            while (!q.isEmpty() && q.peek() <= i - k) {
                q.dequeue();
            }

            // Add next element
            if (i < n && arr[i] < 0) {
                q.enqueue(i);
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {12, -1, -7, 8, -15, 30, 16, 28};
        int k = 3;

        firstNegative(arr, k);
    }
}