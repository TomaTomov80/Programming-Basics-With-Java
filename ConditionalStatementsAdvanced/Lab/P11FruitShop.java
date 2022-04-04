package ConditionalStatementsAdvanced.Lab;

import java.util.Scanner;

public class P11FruitShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String fruit = scanner.nextLine();
        String dayOfWeek = scanner.nextLine();
        double amount = Double.parseDouble(scanner.nextLine());
        double banana = 2.5;
        double apple = 1.20;
        double orange = 0.85;
        double grapefruit = 1.45;
        double kiwi = 2.7;
        double pineapple = 5.5;
        double grapes = 3.85;
        double price = 0;
        boolean validDay = dayOfWeek.equals("Monday") || dayOfWeek.equals("Tuesday") || dayOfWeek.equals("Wednesday") || dayOfWeek.equals("Thursday") || dayOfWeek.equals("Friday") || dayOfWeek.equals("Saturday") || dayOfWeek.equals("Sunday");
        boolean validFruit = fruit.equals("banana") || fruit.equals("apple") || fruit.equals("orange") || fruit.equals("grapefruit") || fruit.equals("kiwi") || fruit.equals("pineapple") || fruit.equals("grapes");
        if (!validDay || !validFruit) {
            System.out.println("error");
        } else {
            switch (dayOfWeek) {
                case "Saturday":
                case "Sunday":
                    banana = 2.7;
                    apple = 1.25;
                    orange = 0.9;
                    grapefruit = 1.6;
                    kiwi = 3.0;
                    pineapple = 5.6;
                    grapes = 4.2;
                    break;
            }
            switch (fruit) {
                case "banana":
                    price = banana;
                    break;
                case "apple":
                    price = apple;
                    break;
                case "orange":
                    price = orange;
                    break;
                case "grapefruit":
                    price = grapefruit;
                    break;
                case "kiwi":
                    price = kiwi;
                    break;
                case "pineapple":
                    price = pineapple;
                    break;
                case "grapes":
                    price = grapes;
                    break;
            }
            System.out.printf("%.2f", amount * price);
        }
    }
}

