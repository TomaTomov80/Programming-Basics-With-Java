package ConditionalStatementsAdvanced.Exercises;

import java.util.Scanner;

public class P03NewHouse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String flowersType = scanner.nextLine();
        int flowerNum = Integer.parseInt(scanner.nextLine());
        int budget = Integer.parseInt(scanner.nextLine());
        double price = 0;
        switch (flowersType) {
            case "Roses":
                if (flowerNum > 80) {
                    price = 5 * 0.9;
                } else {
                    price = 5;
                }
                break;
            case "Dahlias":
                if (flowerNum > 90) {
                    price = 3.8 * 0.85;
                } else {
                    price = 3.8;
                }
                break;
            case "Tulips":
                if (flowerNum > 80) {
                    price = 2.8 * 0.85;
                } else {
                    price = 2.8;
                }
                break;
            case "Narcissus":
                if (flowerNum < 120) {
                    price = 3 * 1.15;
                } else {
                    price = 3;
                }
                break;
            case "Gladiolus":
                if (flowerNum < 80) {
                    price = 2.5 * 1.2;
                } else {
                    price = 2.5;
                }
                break;
        }
        double total = flowerNum * price;
        double diff = Math.abs(total - budget);
        if (total > budget) {
            System.out.printf("Not enough money, you need %.2f leva more.", diff);
        } else {
            System.out.printf("Hey, you have a great garden with %d %s and %.2f leva left.", flowerNum, flowersType, diff);
        }
    }
}
