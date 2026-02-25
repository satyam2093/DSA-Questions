// 6.	Max Consecutive Ones: Given a binary array, find the maximum number of consecutive 1s.


public class Problem6 {

    public static void CountMaximumConsecutiveOnes(int[] arr){
        int count=0;
        int consecutiveCount=0;
        for (int i = 0; i <arr.length; i++) {
            
            if(arr[i]==1){
                count++;
                consecutiveCount=count;
                

            }else{
                count=0;
            }

            
        }
        System.out.println("The consecutive repeated ones number are :"+ consecutiveCount);

    }
     public static void main(String[] args) {
     int arr[] = { 1, 0,0,0,0,1,1,1,1, 0, 0 };
     for (int i = 0; i < arr.length; i++) {
         System.out.print(+arr[i]+"  ");
         
     }
     System.out.println(" " );
     CountMaximumConsecutiveOnes(arr);


   
    }
    
}
