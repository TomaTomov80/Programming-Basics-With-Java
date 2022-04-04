package NestedLoops.Exercises;

import java.util.Scanner;

public class UniquePINCodes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = Integer.parseInt(scanner.nextLine());
        int num2 = Integer.parseInt(scanner.nextLine());
        int num3 = Integer.parseInt(scanner.nextLine());
        for (int i = 2; i <= num1; i++) {
            if (i % 2 == 0) {
                for (int j = 2; j <= num2; j++) {
                    if (j != 4 && j != 6 && j != 8 && j != 9) {
                        for (int k = 1; k <= num3; k++) {
                            if (k % 2 == 0) {
                                System.out.printf("%d %d %d\n", i, j, k);
                            }
                        }
                    }
                }
            }
        }
    }
}
