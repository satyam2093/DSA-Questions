public class Problem10 {

    
    static void shiftArray(int[] arr, int n) {
        if (arr == null || arr.length == 0) {
            return;
        }

        int len = arr.length;
        n = n % len;

     
        reverse(arr, 0, len - 1);
      
        reverse(arr, 0, n - 1);
       
        reverse(arr, n, len - 1);
    }


    static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {



      

        // Test circular shift
        int[] arr2 = {1, 2, 3, 4, 5};
        System.out.print("\nOriginal array: ");
        printArray(arr2);

        int shiftPosition = 2;
        shiftArray(arr2, shiftPosition);
        System.out.print("After shifting by " + shiftPosition + " positions: ");
        printArray(arr2);
    }
}