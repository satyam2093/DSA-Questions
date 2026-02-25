// 4.	Find the Minimum/Maximum Number: Traverse the entire array to find the smallest or largest element as well as second largest and second smallest.
public class LinearSearchProblem4 {

    public static void findMinMax(int[] arr) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int secondMin = Integer.MAX_VALUE;
        int secondMax = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            int num = arr[i];

            // Find minimum and second minimum
            if (num < min) {
                secondMin = min;
                min = num;
            } else if (num < secondMin && num != min) {
                secondMin = num;
            }

            // Find maximum and second maximum
            if (num > max) {
                secondMax = max;
                max = num;
            } else if (num > secondMax && num != max) {
                secondMax = num;
            }
        }

        System.out.println("Minimum: " + min);
        System.out.println("Second Minimum: " + secondMin);
        System.out.println("Maximum: " + max);
        System.out.println("Second Maximum: " + secondMax);
    }

    public static void main(String[] args) {
        int[] arr = {5, 2, 9, 1, 7, 3};

        findMinMax(arr);
    }
}