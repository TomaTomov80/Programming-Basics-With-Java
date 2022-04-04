package ConditionalStatements.Exercise;

import java.util.Scanner;

public class FuelTankPart2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String fuelType = scanner.nextLine();
        double fuelLitres = Double.parseDouble(scanner.nextLine());
        String clubCardVal = scanner.nextLine();
        if (fuelType.equals("Gasoline")) {
            if (fuelLitres < 20) {
                if (clubCardVal.equals("Yes")) {
                    double totalPrice = fuelLitres * (2.22 - 0.18);
                    System.out.printf("%.2f lv.", totalPrice);
                } else {
                    double totalPrice = fuelLitres * 2.22;
                    System.out.printf("%.2f lv.", totalPrice);
                }
            } else if (fuelLitres <= 25) {
                if (clubCardVal.equals("Yes")) {
                    double totalPrice = (fuelLitres * (2.22 - 0.18)) * 0.92;
                    System.out.printf("%.2f lv.", totalPrice);
                } else {
                    double totalPrice = (fuelLitres * 2.22) * 0.92;
                    System.out.printf("%.2f lv.", totalPrice);
                }
            } else {
                if (clubCardVal.equals("Yes")) {
                    double totalPrice = (fuelLitres * (2.22 - 0.18)) * 0.9;
                    System.out.printf("%.2f lv.", totalPrice);
                } else {
                    double totalPrice = (fuelLitres * 2.22) * 0.9;
                    System.out.printf("%.2f lv.", totalPrice);
                }
            }


        } else if (fuelType.equals("Gas")) {
            if (fuelLitres < 20) {
                if (clubCardVal.equals("Yes")) {
                    double totalPrice = fuelLitres * (0.93 - 0.08);
                    System.out.printf("%.2f lv.", totalPrice);
                } else {
                    double totalPrice = fuelLitres * 0.93;
                    System.out.printf("%.2f lv.", totalPrice);
                }
            } else if (fuelLitres <= 25) {
                if (clubCardVal.equals("Yes")) {
                    double totalPrice = (fuelLitres * (0.93 - 0.08)) * 0.92;
                    System.out.printf("%.2f lv.", totalPrice);
                } else {
                    double totalPrice = (fuelLitres * 0.93) * 0.92;
                    System.out.printf("%.2f lv.", totalPrice);
                }
            } else {
                if (clubCardVal.equals("Yes")) {
                    double totalPrice = (fuelLitres * (0.93 - 0.08)) * 0.9;
                    System.out.printf("%.2f lv.", totalPrice);
                } else {
                    double totalPrice = (fuelLitres * 0.93) * 0.9;
                    System.out.printf("%.2f lv.", totalPrice);
                }
            }
        } else if (fuelType.equals("Diesel")) {
            if (fuelLitres < 20) {
                if (clubCardVal.equals("Yes")) {
                    double totalPrice = fuelLitres * (2.33 - 0.12);
                    System.out.printf("%.2f lv.", totalPrice);
                } else {
                    double totalPrice = fuelLitres * 2.33;
                    System.out.printf("%.2f lv.", totalPrice);
                }
            } else if (fuelLitres <= 25) {
                if (clubCardVal.equals("Yes")) {
                    double totalPrice = (fuelLitres * (2.33 - 0.12)) * 0.92;
                    System.out.printf("%.2f lv.", totalPrice);
                } else {
                    double totalPrice = (fuelLitres * 2.33) * 0.92;
                    System.out.printf("%.2f lv.", totalPrice);
                }
            } else {
                if (clubCardVal.equals("Yes")) {
                    double totalPrice = (fuelLitres * (2.33 - 0.12)) * 0.9;
                    System.out.printf("%.2f lv.", totalPrice);
                } else {
                    double totalPrice = (fuelLitres * 2.33) * 0.9;
                    System.out.printf("%.2f lv.", totalPrice);
                }
            }
        }
    }
}