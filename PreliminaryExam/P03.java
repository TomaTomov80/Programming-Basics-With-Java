package PreliminaryExam;

import java.util.Scanner;

public class P03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double packetKgs = Double.parseDouble(scanner.nextLine());
        String service = scanner.nextLine();
        int distance = Integer.parseInt(scanner.nextLine());
        double price = 0;
        switch (service) {
            case "standard":
                if (packetKgs < 1) {
                    price = distance * 3;
                } else if (packetKgs < 10) {
                    price = distance * 5;
                } else if (packetKgs < 40) {
                    price = distance * 10;
                } else if (packetKgs < 90) {
                    price = distance * 15;
                } else if (packetKgs < 150) {
                    price = distance * 20;
                }
                break;
            case "express":
                if (packetKgs < 1) {
                    price = (packetKgs * 3 * 0.8 * distance) + (3 * distance);
                } else if (packetKgs < 10) {
                    price = (packetKgs * 5 * 0.4 * distance) + (5 * distance);
                } else if (packetKgs < 40) {
                    price = (packetKgs * 10 * 0.05 * distance) + (10 * distance);
                } else if (packetKgs < 90) {
                    price = (packetKgs * 15 * 0.02 * distance) + (15 * distance);
                } else if (packetKgs < 150) {
                    price = (packetKgs * 20 * 0.01 * distance) + (20 * distance);
                }
                break;
        }
        System.out.printf("The delivery of your shipment with weight of %.3f kg. would cost %.2f lv.", packetKgs, price / 100);
    }
}
