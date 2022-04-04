package ConditionalStatementsAdvanced.Lab;

import java.util.Scanner;

public class Proba {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String fruit = scanner.nextLine();
        String dayOfWeek = scanner.nextLine();
        double count = Double.parseDouble(scanner.nextLine());
        double price = 0.0;
        //(banana / apple / orange / grapefruit / kiwi / pineapple / grapes
        switch (dayOfWeek) {
            case "Monday":
            case "Tuesday":
            case "Wednesday":
            case "Thursday":
            case "Friday":
                if (fruit.equals("banana")) {
                    price = count * 2.50;
                    System.out.printf("%.2f", price);
                } else if (fruit.equals("apple")) {
                    price = count * 1.20;
                    System.out.printf("%.2f", price);
                } else if (fruit.equals("orange")) {
                    price = count * 0.85;
                    System.out.printf("%.2f", price);
                } else if (fruit.equals("grapefruit")) {
                    price = count * 1.45;
                    System.out.printf("%.2f", price);
                } else if (fruit.equals("kiwi")) {
                    price = count * 2.70;
                    System.out.printf("%.2f", price);
                } else if (fruit.equals("pineapple")) {
                    price = count * 5.50;
                    System.out.printf("%.2f", price);
                } else if (fruit.equals("grapes")) {
                    price = count * 3.85;
                    System.out.printf("%.2f", price);
                } else
                    System.out.println("error");
        }
        switch (dayOfWeek) {
            case "Saturday":
            case "Sunday":
                if (fruit.equals("banana")) {
                    price = count * 2.70;
                    System.out.printf("%.2f", price);
                } else if (fruit.equals("apple")) {
                    price = count * 1.25;
                    System.out.printf("%.2f", price);
                } else if (fruit.equals("orange")) {
                    price = count * 0.90;
                    System.out.printf("%.2f", price);
                } else if (fruit.equals("grapefruit")) {
                    price = count * 1.60;
                    System.out.printf("%.2f", price);
                } else if (fruit.equals("kiwi")) {
                    price = count * 3.00;
                    System.out.printf("%.2f", price);
                } else if (fruit.equals("pineapple")) {
                    price = count * 5.60;
                    System.out.printf("%.2f", price);
                } else if (fruit.equals("grapes")) {
                    price = count * 4.20;
                    System.out.printf("%.2f", price);
                } else
                    System.out.println("error");

        }
    }
}

