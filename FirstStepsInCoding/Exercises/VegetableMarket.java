package FirstStepsInCoding.Exercises;

import java.util.Scanner;

public class VegetableMarket {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double priceVeg = Double.parseDouble(scanner.nextLine());
        double priceFruit = Double.parseDouble(scanner.nextLine());
        int vegKilograms = Integer.parseInt(scanner.nextLine());
        int fruitsKilograms = Integer.parseInt(scanner.nextLine());
        double totalPrice = ((priceVeg * vegKilograms) + (priceFruit * fruitsKilograms)) / 1.94;
        System.out.printf("%.2f", totalPrice);
    }
}
