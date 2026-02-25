// 4.	Delete Middle Element: Deleting the middle element from a stack without using another explicit data structure.
public class ProblemStack4 {

    int size = 100;
    int[] stack = new int[size];
    int top = -1;

    // Push
    public void push(int x) {
        stack[++top] = x;
    }

    // Pop
    public int pop() {
        return stack[top--];
    }

    // Delete middle element
    public void deleteMiddle() {
        int n = top + 1; // current size
        deleteMiddleUtil(n / 2);
    }

    // Recursive function
    private void deleteMiddleUtil(int mid) {
        if (mid == 0) {
            pop(); // remove middle element
            return;
        }

        int temp = pop();
        deleteMiddleUtil(mid - 1);
        push(temp); // push back other elements
    }

    // Display stack
    public void display() {
        for (int i = 0; i <= top; i++) {
            System.out.print(stack[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        ProblemStack4 s = new ProblemStack4();

        s.push(10);
        s.push(20);
        s.push(30);
        s.push(40);
        s.push(50);

        System.out.print("Original Stack: ");
        s.display();

        s.deleteMiddle();

        System.out.print("After Deleting Middle: ");
        s.display();
    }
}