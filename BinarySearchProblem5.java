// 5.	Square Root of a Number: Calculating the integer square root of a number efficiently by searching for the value x where x*x <= number and (x+1)*(x+1) > number.
public class BinarySearchProblem5 {

    public static int integerSqrt(int n) {
        if (n == 0 || n == 1) return n;

        int low = 1, high = n;
        int ans = 0;

        while (low <= high) {
            int mid = (low + high) / 2;

            long square = (long) mid * mid;

            if (square == n) {
                return mid;
            } 
            else if (square < n) {
                ans = mid;       // possible answer
                low = mid + 1;   // search right
            } 
            else {
                high = mid - 1;  // search left
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int n = 10;
        int result = integerSqrt(n);
        System.out.println("Integer Square Root: " + result);
    }
}