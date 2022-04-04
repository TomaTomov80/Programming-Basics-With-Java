package ConditionalStatements.Exercise;

import java.util.Scanner;

public class FuelTankPart22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String fuelType = scanner.nextLine();
        double fuelLitres = Double.parseDouble(scanner.nextLine());
        String clubCardVal = scanner.nextLine();
        double priceGasoline = 0;
        double priceGas = 0;
        double priceDiesel = 0;
        if (fuelType.equals("Gasoline")) {
            priceGasoline = 2.22;
        } else if (fuelType.equals("Gas")) {
            priceGas = 0.93;
        } else {
            priceDiesel = 2.33;
        }
        if (clubCardVal.equals("Yes")) {
            priceGasoline = priceGasoline * 0.9189;
            priceGas = priceGas * 0.91398;
            priceDiesel = priceDiesel * 0.9485;
        }
        double totalPrice = (fuelLitres * priceGasoline) + (fuelLitres * priceGas) + (fuelLitres * priceDiesel);
        if (fuelLitres < 20) {
            totalPrice = totalPrice;
        } else if (fuelLitres <= 25) {
            totalPrice = totalPrice * 0.92;
        } else {
            totalPrice = totalPrice * 0.9;
        }
        System.out.printf("%.2f lv.", totalPrice);
    }
}