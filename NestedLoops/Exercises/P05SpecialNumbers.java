package NestedLoops.Exercises;

import java.util.Scanner;

public class P05SpecialNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int count = 0;
        for (int i = 1111; i <= 9999; i++) {
            String num = "" + i;
            count = 0;
            for (int j = 0; j < 4; j++) {
                int dig = Integer.parseInt("" + num.charAt(j));
                if (dig != 0 && n % dig == 0 ) {
                    count++;
                }
            }
            if (count == 4) {
                System.out.printf("%d ", i);
            }
        }
    }
}
