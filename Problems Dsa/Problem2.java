//2.	Reverse an Array: Reverse the order of elements in an array in place.

public class Problem2 {
    public static void reverseArray(int[] arr) {
        int startIndex = 0;
        int endIndex = arr.length - 1;
        for (int i = 0; i < arr.length /2; i++) {
            int temp=arr[startIndex];
            arr[i] = arr[endIndex];
            arr[endIndex] = temp;
            endIndex--;
            startIndex++;

        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println(" ");

    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5 };
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println(" ");

        reverseArray(arr);

    }
}
