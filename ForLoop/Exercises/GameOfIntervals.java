package ForLoop.Exercises;

import java.util.Scanner;

public class GameOfIntervals {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        double result = 0;
        int invalidNum = 0;
        int num0To9 = 0;
        int num10To19 = 0;
        int num20To29 = 0;
        int num30To39 = 0;
        int num40To50 = 0;
        for (int i = 1; i <= n; i++) {
            int num = Integer.parseInt(scanner.nextLine());
            if (num < 0 || num > 50) {
                result /= 2;
                invalidNum++;
            } else if (num <= 9) {
                result += num * 0.2;
                num0To9++;
            } else if (num <= 19) {
                result += num * 0.3;
                num10To19++;
            } else if (num <= 29) {
                result += num * 0.4;
                num20To29++;
            } else if (num <= 39) {
                result += 50;
                num30To39++;
            } else {
                result += 100;
                num40To50++;
            }
        }
        System.out.printf("%.2f\n", result);
        System.out.printf("From 0 to 9: %.2f%%\n", (1.0 * num0To9 / n) * 100);
        System.out.printf("From 10 to 19: %.2f%%\n", (1.0 * num10To19 / n) * 100);
        System.out.printf("From 20 to 29: %.2f%%\n", (1.0 * num20To29 / n) * 100);
        System.out.printf("From 30 to 39: %.2f%%\n", (1.0 * num30To39 / n) * 100);
        System.out.printf("From 40 to 50: %.2f%%\n", (1.0 * num40To50 / n) * 100);
        System.out.printf("Invalid numbers: %.2f%%\n", (1.0 * invalidNum / n) * 100);
    }
}
