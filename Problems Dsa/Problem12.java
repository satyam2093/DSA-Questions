public class Problem12 {

    public static int subarraySum(int[] arr, int k) {
        int n = arr.length;
        
        // Step 1: Create prefix sum array
        int[] prefix = new int[n + 1];
        prefix[0] = 0;

        for (int i = 1; i <= n; i++) {
            prefix[i] = prefix[i - 1] + arr[i - 1];
        }

        int count = 0;

        // Step 2: Check all subarrays using prefix sum
        for (int start = 0; start < n; start++) {
            for (int end = start; end < n; end++) {
                int sum = prefix[end + 1] - prefix[start];
                if (sum == k) {
                    count++;
                }
            }
        }

        return count;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, -2, 5};
        int k = 5;

        int result = subarraySum(arr, k);
        System.out.println("Number of subarrays with sum = " + k + " : " + result);
    }
}
 

