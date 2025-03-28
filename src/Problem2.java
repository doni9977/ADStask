import java.util.Scanner;

/**
 * Problem2 - A program to calculate the average of an array of integers.
 * The program takes user input for the array size and elements,
 * then computes and displays the average value
 */
public class Problem2 {

    /**
     * Main method
     * Handles user input and output.
     *
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }

        double avg = FindAvg(array, n);
        System.out.println(avg);
        sc.close();
    }

    /**
     * Calculates average of elements in int array.
     * Time Complexity: O(n) - Linear time
     *
     * @param arr The input array of integers
     * @param n The number of elements in the array
     * @return The average value as a double
     */
    public static double FindAvg(int[] arr, int n) {

        int sum = 0;

        for (int num : arr) {
            sum += num;
        }
        return (double) sum / n;
    }
}