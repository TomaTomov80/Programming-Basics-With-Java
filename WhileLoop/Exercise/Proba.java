package WhileLoop.Exercise;

import java.util.Scanner;

public class Proba {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int targetSum = Integer.parseInt(scanner.nextLine());
        String price = scanner.nextLine();

        int cashCounter = 0;
        int totalCash = 0;
        int cardCounter = 0;
        int totalCard = 0;
        int totalSum = 0;
        int counter = 0;
        boolean isCompleted = false;
        boolean isError = false;

        while (!price.equals("End")) {
            int money = Integer.parseInt(price);
            counter += 1;
            if (counter == 1 && money > 100){
                System.out.println("Error in transaction!");
                isError = true;

            }else if (counter == 1 && money <= 100){
                System.out.println("Product sold!");
                totalCash += money;
                cashCounter++;
            }
            if (counter == 2 && money <= 10){
                System.out.println("Error in transaction!");
                isError = true;
                counter = 0;

            }else if (counter == 2 && money > 10){
                System.out.println("Product sold!");
                totalCard += money;
                counter = 0;
                cardCounter++;
            }
            if ((totalCard + totalCash) >= targetSum) {
                isCompleted = true;
                break;
            }
            price = scanner.nextLine();
            if (price.equals("End")) {
                System.out.println("Failed to collect required money for charity.");
            }
        }
        if (isCompleted) {
            System.out.printf("Average CS: %.2f\n", 1.0 * totalCash / cashCounter);
            System.out.printf("Average CC: %.2f\n", 1.0 * totalCard / cardCounter);
        }

    }
}