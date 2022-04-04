package NestedLoops.Exercises;

import java.util.Scanner;

public class Profit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int coins1Lv = Integer.parseInt(scanner.nextLine());
        int coins2Lv = Integer.parseInt(scanner.nextLine());
        int paper5Lv = Integer.parseInt(scanner.nextLine());
        int sum = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i <= coins1Lv; i++) {
            for (int j = 0; j <= coins2Lv; j++) {
                for (int k = 0; k <= paper5Lv; k++) {
                    int sum1 = i + j * 2 + k * 5;
                    if ( sum1 == sum ){
                        System.out.printf("%d * 1 lv. + %d * 2 lv. + %d * 5 lv. = %d lv.\n", i, j, k, sum);
                    }
                    if (sum1 > sum){
                        break;
                    }
                }
            }
        }
    }
}
