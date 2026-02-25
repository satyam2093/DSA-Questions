// 1.	Searching in a Sorted Array: The standard application, involving finding a target element or its insertion position.
public class BinarySearchProblem1 {

    public static int searchOrInsert(int[] arr, int target) {
        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (arr[mid] == target) {
                return mid; // element found
            } else if (arr[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        // target not found, return insertion position
        return low;
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 6};
        int target = 4;

        int result = searchOrInsert(arr, target);
        System.out.println("Index / Insert Position: " + result);
    }
}