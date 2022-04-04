package ForLoop.Exercises;

import java.util.Scanner;

public class EqualPairs3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int value = 0;
        int prevValue = 0;
        int counter = 0;
        int maxDiff = 0;
        for (int i = 1; i <= n; i++) {
            int num1 = Integer.parseInt(scanner.nextLine());
            int num2 = Integer.parseInt(scanner.nextLine());
            value = num1 + num2;
            if (value == prevValue) {
                counter++;
            }
            if (maxDiff < Math.abs(prevValue - value) && i > 1) {
                maxDiff = Math.abs(prevValue - value);
            }
            prevValue = value;
        }
        if (counter == n - 1) {
            System.out.println("Yes, value=" + value);
        } else {
            System.out.println("No, maxdiff=" + maxDiff);
        }
    }
}
