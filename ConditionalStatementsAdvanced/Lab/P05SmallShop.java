package ConditionalStatementsAdvanced.Lab;

import java.util.Scanner;

public class P05SmallShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String product = scanner.nextLine();
        String town = scanner.nextLine();
        double amount = Double.parseDouble(scanner.nextLine());
        switch (town) {
            case "Sofia":
                switch (product) {
                    case "coffee":
                        System.out.println(amount * 0.5);
                        break;
                    case "water":
                        System.out.println(amount * 0.8);
                        break;
                    case "beer":
                        System.out.println(amount * 1.2);
                        break;
                    case "sweets":
                        System.out.println(amount * 1.45);
                        break;
                    case "peanuts":
                        System.out.println(amount * 1.6);
                        break;
                }
                break;
            case "Plovdiv":
                switch (product) {
                    case "coffee":
                        System.out.println(amount * 0.4);
                        break;
                    case "water":
                        System.out.println(amount * 0.7);
                        break;
                    case "beer":
                        System.out.println(amount * 1.15);
                        break;
                    case "sweets":
                        System.out.println(amount * 1.30);
                        break;
                    case "peanuts":
                        System.out.println(amount * 1.5);
                        break;
                }
                break;
            case "Varna":
                switch (product) {
                    case "coffee":
                        System.out.println(amount * 0.45);
                        break;
                    case "water":
                        System.out.println(amount * 0.7);
                        break;
                    case "beer":
                        System.out.println(amount * 1.1);
                        break;
                    case "sweets":
                        System.out.println(amount * 1.35);
                        break;
                    case "peanuts":
                        System.out.println(amount * 1.55);
                        break;
                }
                break;
        }
    }
}
