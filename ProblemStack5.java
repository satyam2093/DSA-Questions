// 5.	Evaluate Postfix/Prefix Expression: Calculate the value of an expression in postfix or prefix notation using a stack.
public class ProblemStack5 {

    int size = 100;
    int[] stack = new int[size];
    int top = -1;

    void push(int x) {
        stack[++top] = x;
    }

    int pop() {
        return stack[top--];
    }

    // Evaluate Postfix Expression
    public int evaluatePostfix(String exp) {
        top = -1;

        for (int i = 0; i < exp.length(); i++) {
            char ch = exp.charAt(i);

            if (Character.isDigit(ch)) {
                push(ch - '0');
            } else {
                int val2 = pop();
                int val1 = pop();
                push(applyOperator(val1, val2, ch));
            }
        }
        return pop();
    }

    // Evaluate Prefix Expression
    public int evaluatePrefix(String exp) {
        top = -1;

        for (int i = exp.length() - 1; i >= 0; i--) {
            char ch = exp.charAt(i);

            if (Character.isDigit(ch)) {
                push(ch - '0');
            } else {
                int val1 = pop();
                int val2 = pop();
                push(applyOperator(val1, val2, ch));
            }
        }
        return pop();
    }

    // Operator Logic
    private int applyOperator(int a, int b, char op) {
        if (op == '+') return a + b;
        if (op == '-') return a - b;
        if (op == '*') return a * b;
        if (op == '/') return a / b;
        return 0;
    }

    public static void main(String[] args) {
        ProblemStack5 obj = new ProblemStack5();

        String postfix = "23*54*+9-";
        System.out.println("Postfix Result: " + obj.evaluatePostfix(postfix));

        String prefix = "-+*235*49";
        System.out.println("Prefix Result: " + obj.evaluatePrefix(prefix));
    }
}