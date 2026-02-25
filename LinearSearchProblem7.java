// 7.	Find the Missing Number: Given an array of size with distinct integers in the range of [1, n], find the missing number. A naive approach involves linearly searching for each number in the range within the array.
public class LinearSearchProblem7 {

    public static int findMissing(int[] arr, int n) {

        // Check each number from 1 to n
        for (int num = 1; num <= n; num++) {
            boolean found = false;

            // Linear search in array
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == num) {
                    found = true;
                    break;
                }
            }

            // If number not found, it's missing
            if (!found) {
                return num;
            }
        }

        return -1; // no missing number
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 5};
        int n = 5; // numbers should be from 1 to 5

        int missing = findMissing(arr, n);
        System.out.println("Missing Number: " + missing);
    }
}