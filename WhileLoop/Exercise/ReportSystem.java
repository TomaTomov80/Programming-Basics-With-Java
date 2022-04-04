package WhileLoop.Exercise;

import java.util.Scanner;

public class ReportSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sumNeeded = Integer.parseInt(scanner.nextLine());
        int paymentNum = 0;
        int cashCount = 0;
        int cardCount = 0;
        int sumCash = 0;
        int sumCard = 0;
        while (sumNeeded > 0) {
            String sumText = scanner.nextLine();
            if (sumText.equals("End")) {
                break;
            }
            int sum = Integer.parseInt(sumText);
            paymentNum++;
            if (paymentNum % 2 == 0) {
                if (sum > 10) {
                    sumNeeded = sumNeeded - sum;
                    sumCard += sum;
                    cardCount++;
                    System.out.println("Product sold!");
                } else {
                    System.out.println("Error in transaction!");
                }
            } else {
                if (sum <= 100) {
                    sumNeeded = sumNeeded - sum;
                    sumCash += sum;
                    cashCount++;
                    System.out.println("Product sold!");
                } else {
                    System.out.println("Error in transaction!");
                }
            }
        }
        if (sumNeeded > 0) {
            System.out.println("Failed to collect required money for charity.");
        } else {
            System.out.printf("Average CS: %.2f\n", sumCash * 1.0 / cashCount);
            System.out.printf("Average CC: %.2f", sumCard * 1.0 / cardCount);
        }
    }
}
