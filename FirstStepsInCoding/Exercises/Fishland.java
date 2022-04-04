package FirstStepsInCoding.Exercises;

import java.util.Scanner;

public class Fishland {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double skumriaPrice = Double.parseDouble(scanner.nextLine());
        double cacaPrice = Double.parseDouble(scanner.nextLine());
        double palamudKgs = Double.parseDouble(scanner.nextLine());
        double safridKgs = Double.parseDouble(scanner.nextLine());
        int musselsKgs = Integer.parseInt(scanner.nextLine());
        double palamudPrice = skumriaPrice * 1.6;
        double safridPrice = cacaPrice * 1.8;
        double totalPrice = (palamudPrice * palamudKgs) + (safridPrice * safridKgs) + (musselsKgs * 7.5);
        System.out.printf("%.2f", totalPrice);

    }
}
