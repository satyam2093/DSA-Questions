// 4.	Circular Queue Implementation: Implement a queue that efficiently reuses array space by connecting the last position back to the first, avoiding the shifting cost of a simple array implementation.



public class ProblemQueue4 {

    static class CircularQueue {
        int[] arr;
        int front, rear, size, capacity;

        CircularQueue(int capacity) {
            this.capacity = capacity;
            arr = new int[capacity];
            front = 0;
            rear = -1;
            size = 0;
        }

        boolean isFull() {
            return size == capacity;
        }

        boolean isEmpty() {
            return size == 0;
        }

        void enqueue(int x) {
            if (isFull()) {
                System.out.println("Queue is Full");
                return;
            }
            rear = (rear + 1) % capacity;
            arr[rear] = x;
            size++;
            System.out.println(x + " inserted");
        }

        int dequeue() {
            if (isEmpty()) {
                System.out.println("Queue is Empty");
                return -1;
            }
            int value = arr[front];
            front = (front + 1) % capacity;
            size--;
            return value;
        }

        int peek() {
            if (isEmpty()) {
                System.out.println("Queue is Empty");
                return -1;
            }
            return arr[front];
        }
    }

    public static void main(String[] args) {
        CircularQueue q = new CircularQueue(5);

        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.enqueue(40);
        q.enqueue(50);

        System.out.println("Removed: " + q.dequeue());
        q.enqueue(60);

        while (!q.isEmpty()) {
            System.out.print(q.dequeue() + " ");
        }
    }
}