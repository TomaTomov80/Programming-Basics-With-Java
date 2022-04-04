package ForLoop.Exercises;

import java.util.Scanner;

public class EqualPairs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int sum1 = 0;
        int sum = 0;
        int totalSum = 0;
        int diff = 0;
        int maxDiff = 0;
        int sumPrev = 0;
        for (int i = 1; i <= n; i++) {
            int num1 = Integer.parseInt(scanner.nextLine());
            int num2 = Integer.parseInt(scanner.nextLine());
            sum = num1 + num2;
            if (i <= 1) {
                sum1 = sum;
            }
            if (sum1 == sum) {
                totalSum += sum;
            }
            if (i <= 2) {
                maxDiff = Math.abs(sum1 - sum);
                sumPrev = sum;
            }
            if (i > 2) {
                diff = Math.abs(sumPrev - sum);
                sumPrev = sum;
                if ( diff > maxDiff){
                    maxDiff = diff;
                }
            }
        }
        if ((totalSum / n) == sum1){
            System.out.printf("Yes, value=%d", sum1);
        } else {
            System.out.printf("No, maxdiff=%d", maxDiff);
        }
    }
}
