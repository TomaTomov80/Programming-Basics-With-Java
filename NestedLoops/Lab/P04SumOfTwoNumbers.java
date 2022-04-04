package NestedLoops.Lab;

import java.util.Scanner;

public class P04SumOfTwoNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = Integer.parseInt(scanner.nextLine());
        int num2 = Integer.parseInt(scanner.nextLine());
        int magicNum = Integer.parseInt(scanner.nextLine());
        int count = 0;
        int sum = 0;
        boolean validSum = false;
        for (int i = num1; i <= num2; i++) {
            for (int j = num1; j <= num2; j++) {
                count++;
                sum = i + j;
                if (sum == magicNum){
                    System.out.printf("Combination N:%d (%d + %d = %d)\n", count, i, j, magicNum);
                    validSum = true;
                    break;
                }
            }
            if (validSum){
                break;
            }

        }
        if (!validSum){
            System.out.printf("%d combinations - neither equals %d", count, magicNum);
        }
    }
}
