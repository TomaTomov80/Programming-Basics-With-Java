package ConditionalStatementsAdvanced.Exercises;

import java.util.Scanner;

public class P05Journey {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budget = Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine();
        if (budget <= 100 && season.equals("summer")) {
            budget *= 0.3;
            System.out.println("Somewhere in Bulgaria");
            System.out.printf("Camp - %.2f", budget);
        } else if (budget <= 100 && season.equals("winter")) {
            budget *= 0.7;
            System.out.println("Somewhere in Bulgaria");
            System.out.printf("Hotel - %.2f", budget);
        }
        if ((budget > 100 && budget <= 1000) && season.equals("summer")) {
            budget *= 0.4;
            System.out.println("Somewhere in Balkans");
            System.out.printf("Camp - %.2f", budget);
        } else if ((budget > 100 && budget <= 1000) && season.equals("winter")) {
            budget *= 0.8;
            System.out.println("Somewhere in Balkans");
            System.out.printf("Hotel - %.2f", budget);
        } else if (budget > 1000) {
            budget *= 0.9;
            System.out.println("Somewhere in Europe");
            System.out.printf("Hotel - %.2f", budget);
        }
    }
}
