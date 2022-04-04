package ForLoop.Lab;

import java.util.Scanner;

public class P09LeftAndRightSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int sum1 = 0;
        int sum2 = 0;
        for (int i = 1; i <= 2 * n; i++) {
            int num = Integer.parseInt(scanner.nextLine());
            if (i <= n) {
                sum1 = sum1 + num;
            } else {
                sum2 = sum2 + num;
            }
        }
        int diff = Math.abs(sum1 - sum2);
        if (sum1 == sum2) {
            System.out.printf("Yes, sum = %d", sum1);
        }else {
            System.out.printf("No, diff = %d", diff);
        }
    }
}
