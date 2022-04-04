package ForLoop.Exercises;

import java.util.Scanner;

public class EqualPairs1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int sum = 0;
        int totalSum = 0;
        int maxDiff = 0;
        int sumPrev = 0;
        for (int i = 1; i <= n; i++) {
            int num1 = Integer.parseInt(scanner.nextLine());
            int num2 = Integer.parseInt(scanner.nextLine());
            sum = num1 + num2;
            if (i == 1) {
                 totalSum = sum;
            }
            if (i > 1 && sumPrev == sum) {
                totalSum += sum;
            }
            if (i > 1 && Math.abs(sumPrev - sum) > maxDiff) {
                maxDiff = Math.abs(sumPrev - sum);
            }
            sumPrev = sum;
        }
        if ((1.0 * totalSum / n) == sum) {
            System.out.printf("Yes, value=%d", sum);
        } else {
            System.out.printf("No, maxdiff=%d", maxDiff);
        }
    }
}
