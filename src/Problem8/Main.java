package Problem8;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        boolean result = Problem8.isAllDigits(input);
        System.out.println(result ? "Yes" : "No");

        scanner.close();
    }
}
