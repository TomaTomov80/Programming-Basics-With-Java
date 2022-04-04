package ConditionalStatements.Exercise;

import java.util.Scanner;

public class FuelTank {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String fuelType = scanner.nextLine();
        double litresInTank = Double.parseDouble(scanner.nextLine());
        if (fuelType.equals("Diesel")) {
            if (litresInTank >= 25) {
                System.out.println("You have enough diesel.");
            } else {
                System.out.println("Fill your tank with diesel!");
            }
        } else if (fuelType.equals("Gasoline")) {
            if (litresInTank >= 25) {
                System.out.println("You have enough gasoline.");
            } else {
                System.out.println("Fill your tank with gasoline!");
            }
        } else if (fuelType.equals("Gas")) {
            if (litresInTank >= 25) {
                System.out.println("You have enough gas.");
            } else {
                System.out.println("Fill your tank with gas!");
            }
        } else
            System.out.println("Invalid fuel!");
    }
}
