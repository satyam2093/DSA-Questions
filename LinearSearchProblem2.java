// 2.	Search in a Range: Find a target element within a specific range of indices within an array.
public class LinearSearchProblem2 {

    public static int searchInRange(int[] arr, int start, int end, int X) {
        // boundary check
        if (start < 0 || end >= arr.length) {
            return -1;
        }

        for (int i = start; i <= end; i++) {
            if (arr[i] == X) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50, 60};
        int start = 1;
        int end = 4;
        int X = 40;

        int result = searchInRange(arr, start, end, X);

        if (result != -1) {
            System.out.println("Element found at index: " + result);
        } else {
            System.out.println("Element not found in given range");
        }
    }
}