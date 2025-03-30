import java.util.Scanner;

public class Problem6 {
    /**
     * Recursively calculates a^n
     * Time Complexity: O(n)
     * 
     * @param a the base number
     * @param n the exponent
     * @return a raised to the power of n
     */
    public static long power(double a, int n) {

        // any number to power 0 is 1
        if (n == 0) {
            return 1;
        }
        // Recursive case: a^n = a * a^(n-1)
        return (long) (a * power(a, n - 1));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        int n = sc.nextInt();
        long result = power(a, n);
        System.out.println(result);
    }
}