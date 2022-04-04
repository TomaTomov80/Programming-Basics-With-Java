package Exam;

import java.util.Scanner;

public class P06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int locationNum = Integer.parseInt(scanner.nextLine());
        double sum = 0;
        for (int i = 1; i <= locationNum; i++) {
            double averageProd = Double.parseDouble(scanner.nextLine());
            int days = Integer.parseInt(scanner.nextLine());
            sum = 0;
            for (int j = 1; j <= days; j++) {
                double dayProd = Double.parseDouble(scanner.nextLine());;
                sum += dayProd;
            }
            if (sum / days >= averageProd) {

                System.out.printf("Good job! Average gold per day: %.2f.\n", (sum / days));
            } else {
                System.out.printf("You need %.2f gold.\n", (averageProd - sum / days));
            }
        }
    }
}
