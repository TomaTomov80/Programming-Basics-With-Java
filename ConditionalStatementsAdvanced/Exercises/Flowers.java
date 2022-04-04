package ConditionalStatementsAdvanced.Exercises;

import java.util.Scanner;

public class Flowers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int chrysanthemumNum = Integer.parseInt(scanner.nextLine());
        int rosesNum = Integer.parseInt(scanner.nextLine());
        int tulipNum = Integer.parseInt(scanner.nextLine());
        String season = scanner.nextLine();
        String holyday = scanner.nextLine();
        double totalPrice = 0;
        switch (season) {
            case "Spring":
            case "Summer":
                totalPrice = chrysanthemumNum * 2.0 + rosesNum * 4.1 + tulipNum * 2.5;
                break;
            case "Autumn":
            case "Winter":
                totalPrice = chrysanthemumNum * 3.75 + rosesNum * 4.5 + tulipNum * 4.15;
                break;
        }
        switch (holyday) {
            case "Y":
                totalPrice *= 1.15;
                break;
        }
        if (tulipNum > 7 && season.equals("Spring")) {
            totalPrice *= 0.95;
        }
        if (rosesNum >= 10 && season.equals("Winter")) {
            totalPrice *= 0.9;
        }
        if ((chrysanthemumNum + rosesNum + tulipNum) > 20) {
            totalPrice *= 0.8;
        }
        System.out.printf("%.2f", totalPrice + 2);
    }
}
