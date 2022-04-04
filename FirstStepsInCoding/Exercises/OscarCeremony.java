package FirstStepsInCoding.Exercises;

import java.util.Scanner;

public class OscarCeremony {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int hallRent = Integer.parseInt(scanner.nextLine());

        double statuetkiPrice = hallRent * 0.7;
        double cateringPrice = statuetkiPrice * 0.85;
        double musicPrice = cateringPrice * 0.5;
        double totalPrice = hallRent + statuetkiPrice + musicPrice + cateringPrice;


        System.out.printf("%.2f", totalPrice);
    }
}
