// 7.	Next Greater/Smaller Element: For each element in an array, find the nearest element to its right (or left) that is greater or smaller. This is a key monotonic stack problem pattern.

public class ProblemStack7 {

    int size = 100;
    int[] stack = new int[size];
    int top = -1;

    void push(int x) {
        stack[++top] = x;
    }

    int pop() {
        return stack[top--];
    }

    int peek() {
        return stack[top];
    }

    boolean isEmpty() {
        return top == -1;
    }

    // Next Greater Element (Right)
    public int[] nextGreater(int[] arr) {
        int n = arr.length;
        int[] result = new int[n];
        top = -1;

        for (int i = n - 1; i >= 0; i--) {
            while (!isEmpty() && peek() <= arr[i]) {
                pop();
            }

            if (isEmpty()) result[i] = -1;
            else result[i] = peek();

            push(arr[i]);
        }
        return result;
    }

    // Next Smaller Element (Right)
    public int[] nextSmaller(int[] arr) {
        int n = arr.length;
        int[] result = new int[n];
        top = -1;

        for (int i = n - 1; i >= 0; i--) {
            while (!isEmpty() && peek() >= arr[i]) {
                pop();
            }

            if (isEmpty()) result[i] = -1;
            else result[i] = peek();

            push(arr[i]);
        }
        return result;
    }

    public static void main(String[] args) {
        ProblemStack7 obj = new ProblemStack7();

        int[] arr = {4, 5, 2, 10, 8};

        int[] nge = obj.nextGreater(arr);
        int[] nse = obj.nextSmaller(arr);

        System.out.print("Next Greater: ");
        for (int x : nge) System.out.print(x + " ");

        System.out.println();

        System.out.print("Next Smaller: ");
        for (int x : nse) System.out.print(x + " ");
    }
}