package Problem10;

public class Problem10 {
    /**
     * Recursively calculates GCD of two numbers using Euclidean algorithm
     * Time Complexity: O(log(min(a,b)))

     *
     * @param a First number (must be non-negative)
     * @param b Second number (must be non-negative)
     * @return GCD of a and b
     * @throws IllegalArgumentException if either number is negative
     */
    public static int gcd(int a, int b) {
        if (a < 0 || b < 0) {
            throw new IllegalArgumentException("Numbers must be non-negative");
        }

        if (b == 0) {
            return a;
        }

        return gcd(b, a % b);
    }
}
