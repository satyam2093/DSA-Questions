public class ProblemStack1 {

    public static boolean isBalanced(String s) {
        char[] stack = new char[s.length()];
        int top = -1;

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            // Push opening brackets
            if (ch == '(' || ch == '{' || ch == '[') {
                stack[++top] = ch;
            }
            // Handle closing brackets
            else if (ch == ')' || ch == '}' || ch == ']') {
                if (top == -1) {
                    return false; // stack empty
                }

                char popped = stack[top--];

                if ((ch == ')' && popped != '(') ||
                    (ch == '}' && popped != '{') ||
                    (ch == ']' && popped != '[')) {
                    return false;
                }
            }
        }

        return top == -1; // stack should be empty
    }

    public static void main(String[] args) {
        String exp = "{[()]}";

        if (isBalanced(exp)) {
            System.out.println("Balanced");
        } else {
            System.out.println("Not Balanced");
        }
    }
}