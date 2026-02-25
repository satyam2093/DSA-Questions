// 6.	Infix to Postfix/Prefix Conversion: Convert one form of an expression to another, applying precedence rules and associativity.

public class ProblemStack6 {

    int size = 100;
    char[] stack = new char[size];
    int top = -1;

    void push(char c) {
        stack[++top] = c;
    }

    char pop() {
        return stack[top--];
    }

    char peek() {
        return stack[top];
    }

    boolean isEmpty() {
        return top == -1;
    }

    int precedence(char ch) {
        if (ch == '^') return 3;
        if (ch == '*' || ch == '/') return 2;
        if (ch == '+' || ch == '-') return 1;
        return 0;
    }

    // Infix to Postfix
    public String infixToPostfix(String exp) {
        String result = "";
        top = -1;

        for (int i = 0; i < exp.length(); i++) {
            char ch = exp.charAt(i);

            // Operand
            if (Character.isLetterOrDigit(ch)) {
                result += ch;
            }
            // Opening bracket
            else if (ch == '(') {
                push(ch);
            }
            // Closing bracket
            else if (ch == ')') {
                while (!isEmpty() && peek() != '(') {
                    result += pop();
                }
                pop(); // remove '('
            }
            // Operator
            else {
                while (!isEmpty() && precedence(peek()) >= precedence(ch)) {
                    result += pop();
                }
                push(ch);
            }
        }

        // Pop remaining operators
        while (!isEmpty()) {
            result += pop();
        }

        return result;
    }

    // Infix to Prefix
    public String infixToPrefix(String exp) {
        // Reverse infix
        String rev = "";
        for (int i = exp.length() - 1; i >= 0; i--) {
            char ch = exp.charAt(i);
            if (ch == '(') rev += ')';
            else if (ch == ')') rev += '(';
            else rev += ch;
        }

        // Convert reversed infix to postfix
        String postfix = infixToPostfix(rev);

        // Reverse postfix to get prefix
        String prefix = "";
        for (int i = postfix.length() - 1; i >= 0; i--) {
            prefix += postfix.charAt(i);
        }

        return prefix;
    }

    public static void main(String[] args) {
        ProblemStack6 obj = new ProblemStack6();

        String infix = "(A+B)*C";

        System.out.println("Infix: " + infix);
        System.out.println("Postfix: " + obj.infixToPostfix(infix));
        System.out.println("Prefix: " + obj.infixToPrefix(infix));
    }
}