package ForLoop.Exercises;

import java.util.Scanner;

public class BackToThePast {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double moneyGet = Double.parseDouble(scanner.nextLine());
        int yearToReach = Integer.parseInt(scanner.nextLine());
        double moneySpent = 0;
        for (int i = 1800; i <= yearToReach; i++) {
            if (i % 2 == 0) {
                moneySpent +=12000;
            } else {
                moneySpent +=(12000 + 50*(18+(i-1800)));
            }
        }
        double diff = Math.abs(moneyGet - moneySpent);
        if (moneyGet >= moneySpent){
            System.out.printf("Yes! He will live a carefree life and will have %.2f dollars left.", diff);
        } else {
            System.out.printf("He will need %.2f dollars to survive.", diff);
        }
    }
}