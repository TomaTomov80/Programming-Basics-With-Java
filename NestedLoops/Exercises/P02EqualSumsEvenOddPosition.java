package NestedLoops.Exercises;

import java.util.Scanner;

public class P02EqualSumsEvenOddPosition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = Integer.parseInt(scanner.nextLine());
        int num2 = Integer.parseInt(scanner.nextLine());
        for (int i = num1; i <= num2; i++) {
            String text = String.valueOf(i);
            int sumEven = 0;
            int sumOdd = 0;
            for (int j = 0; j <= 5; j++) {
                if (j % 2 == 0) {
                    char symbol = text.charAt(j);
                    String symbolStr = String.valueOf(symbol);
                    int symbolNum = Integer.parseInt(symbolStr);
                    sumEven += symbolNum;
                } else {
                    char symbol = text.charAt(j);
                    String symbolStr = String.valueOf(symbol);
                    int symbolNum = Integer.parseInt(symbolStr);
                    sumOdd += symbolNum;
                }
            }
            if (sumEven == sumOdd) {
                System.out.printf("%d ", i);
            }
        }
    }
}
