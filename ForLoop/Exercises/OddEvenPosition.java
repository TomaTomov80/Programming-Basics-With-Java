package ForLoop.Exercises;

import java.util.Scanner;

public class OddEvenPosition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        double evenMax = Double.NEGATIVE_INFINITY;
        double evenMin = Double.POSITIVE_INFINITY;
        double oddMax = Double.NEGATIVE_INFINITY;
        double oddMin = Double.POSITIVE_INFINITY;
        double evenSum = 0;
        double oddSum = 0;
        for (int i = 1; i <= n; i++) {
            double num = Double.parseDouble(scanner.nextLine());
            if (i % 2 == 0) {
                evenSum += num;
                if (num > evenMax) {
                    evenMax = num;
                }
                if (num < evenMin) {
                    evenMin = num;
                }
            } else {
                oddSum += num;
                if (num > oddMax) {
                    oddMax = num;
                }
                if (num < oddMin) {
                    oddMin = num;
                }
            }
        }
        if ( oddMax == Double.NEGATIVE_INFINITY &&  oddMin == Double.POSITIVE_INFINITY){
            System.out.printf("OddSum=%.2f,\n", oddSum);
            System.out.println("OddMin=No,");
            System.out.println("OddMax=No,");
        } else {
            System.out.printf("OddSum=%.2f,\n", oddSum);
            System.out.printf("OddMin=%.2f,\n", oddMin);
            System.out.printf("OddMax=%.2f,\n", oddMax);
        }
        if ( evenMax == Double.NEGATIVE_INFINITY &&  evenMin == Double.POSITIVE_INFINITY){
            System.out.printf("EvenSum=%.2f,\n", evenSum);
            System.out.println("EvenMin=No,");
            System.out.println("EvenMax=No");
        } else {
            System.out.printf("EvenSum=%.2f,\n", evenSum);
            System.out.printf("EvenMin=%.2f,\n", evenMin);
            System.out.printf("EvenMax=%.2f", evenMax);
        }

    }
}
