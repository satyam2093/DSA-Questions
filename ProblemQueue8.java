// 8.	First Non-Repeating Character in a Stream: Find the first non-repeating character in a stream of characters as they are added, commonly solved using a queue and a frequency map.
public class ProblemQueue8 {

    static class Queue {
        char[] q = new char[100];
        int front = 0, rear = -1;

        void enqueue(char x) {
            q[++rear] = x;
        }

        void dequeue() {
            front++;
        }

        boolean isEmpty() {
            return front > rear;
        }

        char peek() {
            return q[front];
        }
    }

    public static void firstNonRepeating(String stream) {
        int[] freq = new int[256];
        Queue q = new Queue();

        for (int i = 0; i < stream.length(); i++) {
            char ch = stream.charAt(i);
            freq[ch]++;

            q.enqueue(ch);

            // remove repeating chars from front
            while (!q.isEmpty() && freq[q.peek()] > 1) {
                q.dequeue();
            }

            if (q.isEmpty()) {
                System.out.print("-1 ");
            } else {
                System.out.print(q.peek() + " ");
            }
        }
    }

    public static void main(String[] args) {
        String stream = "aabc";
        firstNonRepeating(stream);
    }
}