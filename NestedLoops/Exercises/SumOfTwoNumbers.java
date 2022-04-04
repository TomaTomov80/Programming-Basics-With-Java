package NestedLoops.Exercises;

import java.util.Scanner;

public class SumOfTwoNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());
        int m = Integer.parseInt(scanner.nextLine());
        int count = 0;
        int count1 = 0;
        for (int i = a; i <= b; i++) {
            for (int j = a; j <= b; j++) {
                int sum = i + j;
                count1++;
                if (sum == m) {
                    count++;
                    System.out.printf("Combination N:%d (%d + %d = %d)", count1, i, j, m);
                    break;
                }
            }
            if (count ==1){
                break;
            }
        }
        if (count == 0){
            System.out.printf("%d combinations - neither equals %d", count1, m);
        }
    }
}
