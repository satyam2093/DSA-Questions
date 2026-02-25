// 5.	Search in 2D Arrays: Extend the linear search concept to a two-dimensional array, checking each cell sequentially.
public class LinearSearchProblem5 {

    public static void search2D(int[][] arr, int target) {
        for (int i = 0; i < arr.length; i++) {          // rows
            for (int j = 0; j < arr[i].length; j++) {   // columns
                if (arr[i][j] == target) {
                    System.out.println("Element found at: (" + i + ", " + j + ")");
                    return;
                }
            }
        }
        System.out.println("Element not found");
    }

    public static void main(String[] args) {
        int[][] arr = {
            {1, 3, 5},
            {7, 9, 11},
            {13, 15, 17}
        };

        int target = 9;
        search2D(arr, target);
    }
}