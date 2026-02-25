// 13.	Find Duplicate in an Array: Find the duplicate element in an array containing elements within a specific range.
public class Problem13 {

    public static int findDuplicate(int[] arr) {
        int slow = arr[0];
        int fast = arr[0];

        // Step 1: Detect cycle
        do {
            slow = arr[slow];
            fast = arr[arr[fast]];
        } while (slow != fast);

        // Step 2: Find cycle start (duplicate)
        slow = arr[0];
        while (slow != fast) {
            slow = arr[slow];
            fast = arr[fast];
        }

        return slow;
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 4, 2, 2};
        int duplicate = findDuplicate(arr);
        System.out.println("Duplicate Element: " + duplicate);
    }
}