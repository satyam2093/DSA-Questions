// 1.	Basic Search: Find the index of a given element X in an array/list. If it's not present, return -1. class Name LinearSearchProblem1
public class LinearSearchProblem1 {

    public static int linearSearch(int[] arr, int X) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == X) {
                return i; // element found
            }
        }
        return -1; // element not found
    }

    public static void main(String[] args) {
        int[] arr = {5, 8, 12, 20, 7};
        int X = 20;

        int result = linearSearch(arr, X);

        if (result != -1) {
            System.out.println("Element found at index: " + result);
        } else {
            System.out.println("Element not found");
        }
    }
}