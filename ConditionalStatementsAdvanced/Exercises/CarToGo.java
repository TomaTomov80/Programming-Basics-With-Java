package ConditionalStatementsAdvanced.Exercises;

import java.util.Scanner;

public class CarToGo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budget = Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine();
        String carClass = "";
        String carType = "";
        if (budget <= 100) {
            carClass = "Economy class";
            switch (season) {
                case "Summer":
                    carType = "Cabrio";
                    budget *= 0.35;
                    break;
                case "Winter":
                    carType = "Jeep";
                    budget *= 0.65;
                    break;
            }
        } else if (budget > 100 && budget <= 500) {
            carClass = "Compact class";
            switch (season) {
                case "Summer":
                    carType = "Cabrio";
                    budget *= 0.45;
                    break;
                case "Winter":
                    carType = "Jeep";
                    budget *= 0.8;
                    break;
            }
        } else if (budget > 500) {
            carClass = "Luxury class";
            carType = "Jeep";
            budget *= 0.9;
        }
        System.out.println(carClass);
        System.out.printf("%s - %.2f", carType, budget);
    }
}
