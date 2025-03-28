import java.util.Scanner;

public class Problem3 {
    /**
     * Recursively checks if a number is prime.
     * Time Complexity: O(√n)
     * 
     * @param n The number to check
     * @param i Current divisor to test (start with 2)
     * @return true if prime, false if composite
     */
    public static boolean isPrime(int n, int i) {
        if (n <= 2) 
            return n == 2;  // 2 is prime, numbers < 2 are not
        if (n % i == 0) 
            return false;   // Found a divisor
        if (i * i > n)
            return true;    // No divisors found up to √n

        return isPrime(n, (i == 2) ? 3 : i + 2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        if (n < 2) {
            System.out.println("neither prime nor composite");
        } else if (isPrime(n, 2)) {
            System.out.println("Prime");
        } else {
            System.out.println("Composite");
        }
        
        sc.close();
    }
}