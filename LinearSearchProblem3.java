// 3.	Search in String: Apply the linear search logic to find a specific character within a string.
public class LinearSearchProblem3 {

    public static int searchChar(String str, char ch) {
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ch) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        String str = "Satyam";
        char target = 'y';

        int result = searchChar(str, target);

        if (result != -1) {
            System.out.println("Character found at index: " + result);
        } else {
            System.out.println("Character not found");
        }
    }
}