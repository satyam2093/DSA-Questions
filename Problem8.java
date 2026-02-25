// 8. Two Sum: Given an array and a target sum, find two numbers that add up to the target.

public  class Problem8 {
    public static int[] twoSum(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == target) {
                    return new int[]{arr[i], arr[j]};
                }
            }
        }
        return new int[]{-1, -1}; // if not found
    }

    public static void main(String[] args) {
        int[] arr = {2, 7, 11, 15};
        int target = 18;

        int[] result = twoSum(arr, target);
        System.out.println(result[0] + ", " + result[1]);
    }
} 
  

