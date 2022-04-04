package FirstStepsInCoding.Exercises;

import java.util.Scanner;

public class ChangeBureau {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int bitcoin = Integer.parseInt(scanner.nextLine());
        double ioan = Double.parseDouble(scanner.nextLine());
        double interest = Double.parseDouble(scanner.nextLine());

        double bitcoinToLev = bitcoin * 1168.0;
        double ioanToDol = ioan * 0.15;
        double totalSumLev = bitcoinToLev + (ioanToDol * 1.76);
        double totalSumEvro = totalSumLev / 1.95;
        double totalSumEvroInterest = totalSumEvro * (100 - interest)/ 100;


        System.out.printf("%.2f", totalSumEvroInterest);


    }
}
