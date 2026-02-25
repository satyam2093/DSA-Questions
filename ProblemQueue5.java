// 5.	Sliding Window Maximum: Find the maximum element in every contiguous subarray (window) of a given size k.

public class ProblemQueue5 {

    static class Deque {
        int[] dq = new int[100];
        int front = 0, rear = -1;

        boolean isEmpty() {
            return front > rear;
        }

        void addLast(int x) {
            dq[++rear] = x;
        }

        void removeLast() {
            rear--;
        }

        void removeFirst() {
            front++;
        }

        int getFirst() {
            return dq[front];
        }

        int getLast() {
            return dq[rear];
        }
    }

    public static void slidingWindowMax(int[] arr, int k) {
        int n = arr.length;
        Deque dq = new Deque();

        for (int i = 0; i < n; i++) {

            // Remove indices out of window
            if (!dq.isEmpty() && dq.getFirst() <= i - k) {
                dq.removeFirst();
            }

            // Remove smaller elements from rear
            while (!dq.isEmpty() && arr[dq.getLast()] < arr[i]) {
                dq.removeLast();
            }

            // Add current index
            dq.addLast(i);

            // Print max when window is complete
            if (i >= k - 1) {
                System.out.print(arr[dq.getFirst()] + " ");
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, -1, -3, 5, 3, 6, 7};
        int k = 3;

        slidingWindowMax(arr, k);
    }
}