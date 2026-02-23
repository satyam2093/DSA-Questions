// 1.	Find the Missing Number: Given an array of numbers containing elements from 1 to n, find the missing number.

public class Problem1 {

   public static int missingNumber(int[] arr ){
     int n=arr.length+1;
     int arrSum=n*(n+1)/2;
     int totalSum=0;
     for(int i=0;i<arr.length;i++){
        totalSum+=arr[i];

     }

     int missingValue=arrSum-totalSum;
     return missingValue;



   }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 5 };
        for (int i = 0; i < arr.length; i++) {
            System.out.print(" | "+arr[i]+" | ");
            
        }
        System.out.println(" ");
        System.out.println("The missing value from the array is "+ missingNumber(arr));
    }
}
