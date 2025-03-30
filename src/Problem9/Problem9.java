package Problem9;

public class Problem9 {
    /**
     * Recursively calculates binomial coefficient C(n,k)
     * using the formula: C(n,k) = C(n-1,k-1) + C(n-1,k)
     * with base cases C(n,0) = C(n,n) = 1
     *
     * @param n Total number of items
     * @param k Number of items to choose
     * @return Binomial coefficient C(n,k)
     * @throws IllegalArgumentException if n < 0 or k < 0 or k > n
     */
    public static int calculate(int n, int k) {
        // Check for invalid inputs
        if (n < 0 || k < 0 || k > n) {
            throw new IllegalArgumentException("0 <= k <= n");
        }


        if (k == 0 || k == n) {
            return 1;
        }


        return calculate(n - 1, k - 1) + calculate(n - 1, k);
    }
}
