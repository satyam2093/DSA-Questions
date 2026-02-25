public class ProblemStack2 {

    public static String reverseString(String str) {

        char[] stack = new char[str.length()];
        int top = -1;

        // Push all characters into stack
        for (int i = 0; i < str.length(); i++) {
            stack[++top] = str.charAt(i);
        }

        // Pop characters and build reversed string
        String reversed = "";
        while (top >= 0) {
            reversed = reversed + stack[top--];
        }

        return reversed;
    }

    public static void main(String[] args) {

        String input = "HELLO";
        String result = reverseString(input);

        System.out.println("Original String: " + input);
        System.out.println("Reversed String: " + result);
    }
}