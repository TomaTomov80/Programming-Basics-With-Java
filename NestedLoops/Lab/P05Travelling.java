package NestedLoops.Lab;

import java.util.Scanner;

public class P05Travelling {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String destination = scanner.nextLine();
        while (!destination.equals("End")) {
            double tripPrice = Double.parseDouble(scanner.nextLine());
            int sum = 0;
            while (sum < tripPrice) {
                double save = Double.parseDouble(scanner.nextLine());
                sum += save;
            }
            System.out.printf("Going to %s!\n", destination);
            destination = scanner.nextLine();
        }
    }
}

