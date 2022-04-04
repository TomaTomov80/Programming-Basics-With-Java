package ForLoop.Exercises;

import java.util.Scanner;

public class P02HalfSumElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int maxValue = Integer.MIN_VALUE;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            int nextNum = Integer.parseInt(scanner.nextLine());
            if (nextNum > maxValue) {
                maxValue = nextNum;
            }
            sum = sum + nextNum;
        }
        if (sum == (2 * maxValue)) {
            System.out.println("Yes");
            System.out.printf("Sum = %d", sum - maxValue);
        } else {
            System.out.println("No");
            System.out.printf("Diff = %d", Math.abs(sum - (2 * maxValue)));
        }
    }
}
