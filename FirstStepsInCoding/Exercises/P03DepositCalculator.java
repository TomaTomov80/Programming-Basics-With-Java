package FirstStepsInCoding.Exercises;

import java.util.Scanner;

public class P03DepositCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double depositSum = Double.parseDouble(scanner.nextLine());
        int depositTime = Integer.parseInt(scanner.nextLine());
        double yearInterest = Double.parseDouble(scanner.nextLine());
        double interestPerYear = depositSum * yearInterest / 100;
        double interestPerMonth = interestPerYear / 12;
        double totalSum = depositSum + depositTime * interestPerMonth;
        System.out.println(totalSum);
    }
}
