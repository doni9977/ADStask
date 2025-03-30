package Problem7;

public class Problem7 {
    /**
     * Recursively reverses an array in-place by swapping elements
     * Time Complexity: O(n)
     *
     * @param arr The array to be reversed
     * @param start The starting index for reversal
     * @param end The ending index for reversal
     */
    public static void reverseArray(int[] arr, int start, int end){
        if (start >= end){
            return;
        }

        int temp = arr[start];
        arr[start] = arr [end];
        arr[end] = temp;

        reverseArray(arr, start + 1, end - 1);
    }
}
