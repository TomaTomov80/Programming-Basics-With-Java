package NestedLoops.Exercises;

import java.util.Scanner;

public class SecretDoorsLock {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());
        int c = Integer.parseInt(scanner.nextLine());
        for (int i = 1; i <= a; i++) {
            for (int j = 2; j <= b; j++) {
                for (int k = 1; k <= c; k++) {
                    if (i % 2 == 0 && k % 2 == 0 && j != 4 && j != 6 && j <= 7) {
                        System.out.printf("%d %d %d\n", i, j, k);
                    }
                }
            }
        }
    }
}
