package ConditionalStatementsAdvanced.Exercises;

import java.util.Scanner;

public class P04FishingBoat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int budget = Integer.parseInt(scanner.nextLine());
        String season = scanner.nextLine();
        int fishmanNum = Integer.parseInt(scanner.nextLine());
        double price = 0;
        switch (season) {
            case "Spring":
                price = 3000;
                break;
            case "Summer":
            case "Autumn":
                price = 4200;
                break;
            case "Winter":
                price = 2600;
                break;
        }
        if (fishmanNum <= 6) {
            price *= 0.9;
        } else if (fishmanNum >= 7 && fishmanNum <= 11) {
            price *= 0.85;
        } else if (fishmanNum >= 12) {
            price *= 0.75;
        }
        if (fishmanNum % 2 == 0 && !season.equals("Autumn")){
            price *=0.95;
        }
        double diff = Math.abs(price - budget);
        if (price <= budget){
            System.out.printf("Yes! You have %.2f leva left.", diff);
        } else {
            System.out.printf("Not enough money! You need %.2f leva.", diff);
        }

    }
}
