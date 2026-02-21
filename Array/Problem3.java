public class Problem3 {
    public static void shiftZerosAtLast(int[] arr) {
        int j = 0; 

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j++;
            }
        }

   
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = {1, 0, 0, 2, 0, 3, 4, 5};

       
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        shiftZerosAtLast(arr);
    }
}




// 2nd method
// public class Problem3 {
    // public static void ShiftZerosAtLast(int[] arr) {
        // int index = 0; // position to place non-zero elements
// 
        // Move non-zero elements forward
        // for (int i = 0; i < arr.length; i++) {
            // if (arr[i] != 0) {
                // arr[index++] = arr[i];
            // }
        // }
// 
        // Fill the rest with zeros
        // while (index < arr.length) {
            // arr[index++] = 0;
        // }
// 
        // Print result
        // for (int i = 0; i < arr.length; i++) {
            // System.out.print(arr[i] + " ");
        // }
        // System.out.println();
    // }
// 
    // public static void main(String[] args) {
        // int arr[] = { 1, 0, 0, 2, 0, 3, 4, 5 };
        // for (int i = 0; i < arr.length; i++) {
            // System.out.print(arr[i] + " ");
        // }
        // System.out.println();
        // ShiftZerosAtLast(arr);
    // }
// }


// 3rd
// 
    // for (int i = 0; i < arr.length; i++) {
        // if (arr[i] == 0) {
            // if (arr[endIndex] == 0) {
                // int temp = arr[endIndex - 1];
                // arr[endIndex - 1] = arr[i];
                // arr[i] = temp;
                // endIndex__
// 
            // }else{
            // int temp = arr[endIndex];
            // arr[endIndex] = arr[i];
            // arr[i] = temp;
            // endIndex--;
            // }
        // }
// 
        // }
// 
    // 
    // for (int i = 0; i < arr.length; i++) {
        // System.out.print(arr[i] + " ");
    // }
    // System.out.println(" ");
// 
// }
// 
// public static void main(String[] args) {
    // int arr[] = { 1, 0, 0, 2, 0, 3, 4, 5 };
    // for (int i = 0; i < arr.length; i++) {
        // System.out.print(arr[i] + " ");
    // }
    // System.out.println(" ");
    // ShiftZerosAtLast(arr);
// 
// }