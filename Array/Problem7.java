public class Problem7 {
    public static boolean checkOrder(int[] arr){
        for(int i=0; i<arr.length-1;i++){
            if(arr[i]>arr[i+1]){
                return false;
            }
        }
        return true;

    }

     public static void main(String[] args) {
     int arr[] = { 5,3,2,1};
     for (int i = 0; i < arr.length; i++) {
         System.out.print(" | "+arr[i]+" | ");
         
     }
     System.out.println(" ");
     boolean result=checkOrder(arr);
     if(result==true){
        System.out.println("Ascending Order");
     }else{
        System.out.println("Descending Order ");
     }
    
 }
    
}
