package NestedLoops.Exercises;

import java.util.Scanner;

public class HappyCatParking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int days = Integer.parseInt(scanner.nextLine());
        int hours = Integer.parseInt(scanner.nextLine());
        int count = 0;
        double totalSum = 0;
        for (int i = 1; i <= days; i++) {
            count++;
            double sum = 0;
            for (int j = 1; j <= hours; j++) {
                if (i % 2 == 0 && j % 2 != 0) {
                    sum += 2.5;
                } else if (i % 2 != 0 && j % 2 == 0) {
                    sum += 1.25;
                } else {
                    sum += 1;
                }
                if (j == hours) {
                    System.out.printf("Day: %d - %.2f leva\n", count, sum);
                }
            }
            totalSum += sum;
        }
        System.out.printf("Total: %.2f leva", totalSum);
    }
}
