import java.util.Scanner;

public class Problem4 {
    /**
     * Recursively calculates the factorial of a number.
     * Time Complexity: O(n)
     *
     * @param n The number to calculate factorial for (must be >= 0)
     * @return The factorial of n
     * @throws IllegalArgumentException if n is negative
     */
    public static long factorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("no negative number");
        }

        if (n <= 1) {
            return 1;
        }
        // Recursive case: n! = n * (n-1)!
        return n * factorial(n - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        try {
            long result = factorial(n);
            System.out.println(result);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        sc.close();
    }
}