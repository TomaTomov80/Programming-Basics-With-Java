package NestedLoops.Exercises;

import java.util.Scanner;

public class LuckyNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = Integer.parseInt(scanner.nextLine());
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= 9; j++) {
                for (int k = 1; k <= 9; k++) {
                    for (int l = 1; l <= 9; l++) {
                        String num2Str = "" + i + j + k + l;
                        int num2 = Integer.parseInt(num2Str);
                        if (i + j == k + l) {
                            if (num % (i + j) == 0){
                                System.out.printf("%d ", num2);
                            }
                        }
                    }
                }

            }
        }
    }
}
