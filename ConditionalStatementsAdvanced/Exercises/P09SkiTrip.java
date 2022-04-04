package ConditionalStatementsAdvanced.Exercises;

import java.util.Scanner;

public class P09SkiTrip {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int daysInHotel = Integer.parseInt(scanner.nextLine());
        String roomType = scanner.nextLine();
        String rating = scanner.nextLine();
        double room = 18.0;
        double apartment = 25.0;
        double presidenApartment = 35.0;
        if (daysInHotel < 10) {
            apartment *= 0.7;
            presidenApartment *= 0.9;
        } else if (daysInHotel >= 10 && daysInHotel <= 15) {
            apartment *= 0.65;
            presidenApartment *= 0.85;
        } else {
            apartment *= 0.5;
            presidenApartment *= 0.8;
        }
        if (rating.equals("positive")) {
            room *= 1.25;
            apartment *= 1.25;
            presidenApartment *= 1.25;
        } else if (rating.equals("negative")) {
            room *= 0.9;
            apartment *= 0.9;
            presidenApartment *= 0.9;
        }
        switch (roomType) {
            case "room for one person":
                System.out.printf("%.2f", room * (daysInHotel-1));
                break;
            case "apartment":
                System.out.printf("%.2f", apartment * (daysInHotel-1));
                break;
            case "president apartment":
                System.out.printf("%.2f", presidenApartment * (daysInHotel-1));
                break;
        }

    }
}
