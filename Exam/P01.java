package Exam;

import java.util.Scanner;

public class P01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double pricePerPage = Double.parseDouble(scanner.nextLine());
        double pricePerCover = Double.parseDouble(scanner.nextLine());
        int discount = Integer.parseInt(scanner.nextLine());
        double priceDesigner = Double.parseDouble(scanner.nextLine());
        int teamPay = Integer.parseInt(scanner.nextLine());
        double priceTot = ((pricePerPage * 899) + (pricePerCover * 2)) * (1.0 * (100 - discount)) / 100;
        priceTot = priceTot + priceDesigner;
        priceTot = priceTot * ((1.0 * (100 - teamPay)) / 100);
        System.out.printf("Avtonom should pay %.2f BGN.", priceTot);
    }
}
