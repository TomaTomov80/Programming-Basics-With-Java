package ConditionalStatements.Exercise;

import java.util.Scanner;

public class FuelTank2Not100Judge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String fuelType = scanner.nextLine();
        double litresInTank = Double.parseDouble(scanner.nextLine());
        String enough =  "You have enough";
        String notEnough = "Fill your tank with";
        if (litresInTank < 25) {
            System.out.printf("%s %s!", notEnough, fuelType.toLowerCase());
            } else if (litresInTank >= 25){
            System.out.printf("%s %s!", enough, fuelType.toLowerCase());
        } else{
            System.out.println("Invalid fuel!");
        }
    }
}
