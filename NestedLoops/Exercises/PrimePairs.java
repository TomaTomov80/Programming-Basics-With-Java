package NestedLoops.Exercises;

import java.util.Scanner;

public class PrimePairs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = Integer.parseInt(scanner.nextLine());
        int num2 = Integer.parseInt(scanner.nextLine());
        int diff1 = Integer.parseInt(scanner.nextLine());
        int diff2 = Integer.parseInt(scanner.nextLine());
        int count = 0;
        for (int i = num1; i <= (num1 + diff1); i++) {
            for (int j = num2; j <= (num2 + diff2); j++) {
                for (int k = 2; k <= 9; k++) {
                    if (i % k == 0 || j % k == 0) {
                        count = 0;
                        break;
                    } else {
                        count++;
                    }
                    if (count == 8) {
                        count = 0;
                        System.out.printf("%d%d\n", i, j);
                    }
                }
            }
        }
    }
}
