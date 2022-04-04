package NestedLoops.Exercises;

import java.util.Scanner;

public class P03SumPrimeNonPrime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String numStr = scanner.nextLine();
        int sumNonPrime = 0;
        int sumPrime = 0;
        while (!numStr.equals("stop")) {
            int num = Integer.parseInt(numStr);
            if (num < 0) {
                System.out.println("Number is negative.");
                numStr = scanner.nextLine();
                continue;
            }
            boolean isNonPrime = false;
            for (int i = 2; i < num; i++) {
                if (num % i == 0) {
                    isNonPrime = true;
                }
            }
            if (isNonPrime) {
                sumNonPrime += num;
            } else {
                sumPrime += num;
            }
            numStr = scanner.nextLine();
        }
        System.out.printf("Sum of all prime numbers is: %d\n", sumPrime);
        System.out.printf("Sum of all non prime numbers is: %d", sumNonPrime);

    }
}
