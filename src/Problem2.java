import java.util.Scanner;

public class Problem2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++){
            array[i] = sc.nextInt();
        }

        double avg = FindAvg(array,n);
        System.out.println(avg);
    }

    public static double FindAvg(int[] arr, int n){
        int sum = 0;
        for (int num : arr){
            sum += num;
        }
        return (double) sum / n;
    }
}
