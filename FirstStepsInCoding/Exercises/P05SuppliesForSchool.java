package FirstStepsInCoding.Exercises;

import java.util.Scanner;

public class P05SuppliesForSchool {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int penNum = Integer.parseInt(scanner.nextLine());
        int markerNum = Integer.parseInt(scanner.nextLine());
        int litresPrep = Integer.parseInt(scanner.nextLine());
        int percDiscount = Integer.parseInt(scanner.nextLine());
        double penPrice = penNum * 5.8;
        double markerPrice = markerNum * 7.2;
        double prepPrice = litresPrep * 1.2;
        double totalPrice = penPrice + markerPrice + prepPrice;
        double priceAfterDiscount = totalPrice - (totalPrice * percDiscount*1.0 / 100);
        System.out.println(priceAfterDiscount);

    }
}
