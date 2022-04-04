package ConditionalStatementsAdvanced.Lab;

import java.util.Scanner;

public class P05SmallShopVar1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String product = scanner.nextLine();
        String town = scanner.nextLine();
        double amount = Double.parseDouble(scanner.nextLine());
        double coffee = 0.5;
        double water = 0.8;
        double beer = 1.2;
        double sweets = 1.45;
        double peanuts = 1.6;
        double price = 0;
        switch (town) {
            case "Plovdiv":
                coffee = 0.4;
                water = 0.7;
                beer = 1.15;
                sweets = 1.30;
                peanuts = 1.5;
                break;
            case "Varna":
                coffee = 0.45;
                water = 0.7;
                beer = 1.1;
                sweets = 1.35;
                peanuts = 1.55;
                break;
        }
        switch (product) {
            case "coffee":
                price = coffee;
                break;
            case "water":
                price = water;
                break;
            case "beer":
                price = beer;
                break;
            case "sweets":
                price = sweets;
                break;
            case "peanuts":
                price = peanuts;
                break;
        }
        System.out.println(amount * price);
    }
}
