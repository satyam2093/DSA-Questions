// 8.	Find the First Repeating Element: Identify the element that occurs more than once and whose first occurrence has the smallest index.
public class LinearSearchProblem8 {

    public static int firstRepeating(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            // Check if arr[i] appears again
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    return arr[i]; // first repeating element
                }
            }
        }
        return -1; // no repeating element
    }

    public static void main(String[] args) {
        int[] arr = {10, 5, 3, 4, 3, 5, 6};

        int result = firstRepeating(arr);

        if (result != -1) {
            System.out.println("First Repeating Element: " + result);
        } else {
            System.out.println("No Repeating Element");
        }
    }
}