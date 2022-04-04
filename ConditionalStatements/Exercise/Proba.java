package ConditionalStatements.Exercise;

import java.util.Scanner;

public class Proba {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double priceBaggage = Double.parseDouble(scanner.nextLine());
        double kgBaggage = Double.parseDouble(scanner.nextLine());
        int days = Integer.parseInt(scanner.nextLine());
        int numBaggage = Integer.parseInt(scanner.nextLine());
        double result = 0.0;

        if (kgBaggage < 10) {
            if (days > 30) {
                priceBaggage = priceBaggage * 0.20;
                result = priceBaggage * 1.10;
            } else if (days >= 7 && days <= 30) {
                priceBaggage = priceBaggage * 0.20;
                result = priceBaggage * 1.15;
            } else if (days < 7) {
                priceBaggage = priceBaggage * 0.20;
                result = priceBaggage * 1.40;
            }

        } else if (kgBaggage >= 10 && kgBaggage <= 20) {
            if (days > 30) {
                priceBaggage = priceBaggage * 0.50;
                result = priceBaggage * 1.10;
            } else if (days >= 7 && days <= 30) {
                priceBaggage = priceBaggage * 0.50;
                result = priceBaggage * 1.15;
            } else {
                priceBaggage = priceBaggage * 0.50;
                result = priceBaggage * 1.40;
            }

        } else if (kgBaggage > 20) {
            if (days > 30) {

                result = priceBaggage * 1.10;
            } else if (days >= 7 && days <= 30) {

                result = priceBaggage * 1.15;
            } else {

                result = priceBaggage * 1.40;

            }

        }
        System.out.printf("The total price of bags is: %.2f lv. ", result * numBaggage);
    }
}