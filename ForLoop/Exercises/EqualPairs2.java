package ForLoop.Exercises;

import java.util.Scanner;

public class EqualPairs2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int prevSum = 0;
        int maxDiff = 0;
        boolean equal = true;
        for (int i = 0; i < n; i++) {
            int firstNum = Integer.parseInt(scanner.nextLine());
            int secondNum = Integer.parseInt(scanner.nextLine());
            int sum = firstNum + secondNum;
            if (i > 0) {
                if (sum != prevSum) {
                    equal = false;
                    if (Math.abs(sum - prevSum) > maxDiff) {
                        maxDiff = Math.abs(sum - prevSum);
                    }
                }
            }
            prevSum = sum;
        }
        if (equal) {
            System.out.printf("Yes, value=%d", prevSum);
        } else {
            System.out.printf("No, maxdiff=%d", maxDiff);
        }
    }
}
