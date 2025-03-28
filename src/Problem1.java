import java.util.Scanner;

public class Problem1 {
     /**
     * Receives input from the user, finds the minimum element
     * and outputs the result.
     */
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++){
            array[i] = sc.nextInt();
        }

        int min = FindMin(array, n);
        System.out.println(min);
        sc.close();
    }
    /**
     * Recursively finds the minimum element in an array.
     * Time complexity: O(n), where n is the array size
     * @param arr array of integers to search
     * @param n number of elements to consider
     * @return    минимальный элемент в массиве
     * */

    public static int FindMin(int[] arr, int n){
        if (n == 1){
            return arr[0];
        }
        int MinOfRest = FindMin(arr, n -1);

        if (arr[n - 1] < MinOfRest){
            return arr[n - 1];
        } else {
            return MinOfRest;
        }
    }
}
