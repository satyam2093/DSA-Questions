
// 4.	Remove Duplicates from Sorted Array: Modify a sorted array so that each element appears only once.

public class Problem4 {
    public static void RemoveDuplicate(int[] arr){
        int j=0;
        for(int i=0; i<arr.length;i++){
            if(arr[i]!=arr[j]){
                arr[j+1]=arr[i];
                j++;

            }

        }
        
        for(int i=0; i<=j; i++){
            System.out.print(arr[i]+" ");
        }
        

    }
    public static void main(String[] args) {
        int arr[] = {1, 1,1,1, 2, 3, 4, 4, 5};
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println(" ");
        RemoveDuplicate(arr);
    }
}

