//Find the second largest element from the array


public class Problem5 {

    public static void secondLargest(int[] arr){
        int largest=arr[0];

        int SecondLargest=0;
       
        for (int i=0;i<arr.length;i++){
            if(arr[i]>largest){

                int temp=largest;
                largest=arr[i];
                SecondLargest=temp;

            }else if(arr[i] > SecondLargest && arr[i] != largest){
                SecondLargest = arr[i];
            }
        }
        System.out.println(SecondLargest);
            
    }

     public static void main(String[] args) {
     int arr[] = {25, 0, 0, 2, 0, 13, 24, 5};
    
     for (int i = 0; i < arr.length; i++) {
         System.out.print(arr[i] + " ");
     }
     System.out.println();
     secondLargest(arr);
 }
    
}
