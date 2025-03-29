import java.util.Scanner;

public class Problem5 {
    /**
     * Recursively calculates the n-th Fibonacci number.
     * Time Complexity: O(2^n) (exponential)
     *
     * @param n The index in the Fibonacci sequence (n >= 0)
     * @return The n-th Fibonacci number
     * @throws IllegalArgumentException if n is negative
     */
    public static long fibonacci(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("only non-negative number");
        }

        if (n == 0) return 0;
        if (n == 1) return 1;

        // Recursive case: F(n) = F(n-1) + F(n-2)
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        try {
            long result = fibonacci(n);
            System.out.println(result);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        sc.close();
    }
}