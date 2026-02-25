public class ProblemQueue7 {

    static class Queue {
        String[] q = new String[100];
        int front = 0, rear = -1;

        void enqueue(String x) {
            q[++rear] = x;
        }

        String dequeue() {
            return q[front++];
        }

        boolean isEmpty() {
            return front > rear;
        }
    }

    public static void generateBinary(int n) {
        Queue q = new Queue();
        q.enqueue("1");

        for (int i = 1; i <= n; i++) {
            String curr = q.dequeue();
            System.out.print(curr + " ");

            q.enqueue(curr + "0");
            q.enqueue(curr + "1");
        }
    }

    public static void main(String[] args) {
        int n = 10;
        generateBinary(n);
    }
}