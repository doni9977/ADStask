package Problem7;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }

        // Reverse the array using recursion
        Problem7.reverseArray(array, 0, n - 1);

        // Output result
        for (int num : array) {
            System.out.print(num + " ");
        }

        sc.close();
    }
}
