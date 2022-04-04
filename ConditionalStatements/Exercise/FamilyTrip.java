package ConditionalStatements.Exercise;

import java.util.Scanner;

public class FamilyTrip {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budget = Double.parseDouble(scanner.nextLine());
        int nightNum = Integer.parseInt(scanner.nextLine());
        double pricePerNight = Double.parseDouble(scanner.nextLine());
        int addExpeciesPercent = Integer.parseInt(scanner.nextLine());
        if (nightNum > 7) {
            pricePerNight *= 0.95;
        }
        double totalPrice = nightNum * pricePerNight + (budget * (addExpeciesPercent * 1.0 / 100));
        double diff = Math.abs(totalPrice - budget);
        if (totalPrice <= budget) {
            System.out.printf("Ivanovi will be left with %.2f leva after vacation.", diff);
        } else {
            System.out.printf("%.2f leva needed.", diff);
        }

    }
}
