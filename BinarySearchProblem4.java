// 4.	Finding Floor and Ceiling: Locating the largest element less than or equal to a target (floor) and the smallest element greater than or equal to a target (ceiling) in a sorted array.
public class BinarySearchProblem4 {

    public static void findFloorAndCeiling(int[] arr, int target) {
        int low = 0, high = arr.length - 1;
        int floor = -1, ceiling = -1;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (arr[mid] == target) {
                floor = arr[mid];
                ceiling = arr[mid];
                break;
            }
            else if (arr[mid] < target) {
                floor = arr[mid];   // possible floor
                low = mid + 1;
            }
            else {
                ceiling = arr[mid]; // possible ceiling
                high = mid - 1;
            }
        }

        System.out.println("Floor: " + floor);
        System.out.println("Ceiling: " + ceiling);
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 6, 8};
        int target = 5;

        findFloorAndCeiling(arr, target);
    }
}