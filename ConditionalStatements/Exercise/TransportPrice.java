package ConditionalStatements.Exercise;

import java.util.Scanner;

public class TransportPrice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        String dayOrNight = scanner.nextLine();
        if (n >= 100) {
            double price = n * 0.06;
            System.out.printf("%.2f", price);
        } else if (n >= 20) {
            double price = n * 0.09;
            System.out.printf("%.2f", price);
        } else if (dayOrNight.equals("day")) {
            double price = (n * 0.79) + 0.7;
            System.out.printf("%.2f", price);
        } else {
            double price = (n * 0.90) + 0.7;
            System.out.printf("%.2f", price);
        }
    }
}
