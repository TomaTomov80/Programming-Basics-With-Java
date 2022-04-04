package NestedLoops.Exercises;

import java.util.Scanner;

public class SafePasswordsGenerator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());
        int numMax = Integer.parseInt(scanner.nextLine());
        int count = 0;
        char A = (char) 35;
        char B = (char) 64;
        for (int k = 1; k <= a; k++) {
            for (int l = 1; l <= b; l++) {
                if (count < numMax) {
                    System.out.printf("%c%c%d%d%c%c|", A, B, k, l, B, A);
                    if (A == 55) {
                        A = 34;
                    }
                    if (B == 96) {
                        B = 63;
                    }
                    A++;
                    B++;
                    count++;
                } else {
                    break;
                }
                if (l == b) {
                    break;
                }
            }
        }
    }
}


