package ConditionalStatementsAdvanced.Exercises;

import java.util.Scanner;

public class BikeRace {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int juniorsNum = Integer.parseInt(scanner.nextLine());
        int seniorsNum = Integer.parseInt(scanner.nextLine());
        String routeType = scanner.nextLine();
        double tax = 0;
        switch (routeType) {
            case "trail":
                tax = juniorsNum * 5.5 + seniorsNum * 7;
                break;
            case "cross-country":
                tax = juniorsNum * 8.0 + seniorsNum * 9.5;
                break;
            case "downhill":
                tax = juniorsNum * 12.25 + seniorsNum * 13.75;
                break;
            case "road":
                tax = juniorsNum * 20.0 + seniorsNum * 21.5;
                break;
        }
        if (routeType.equals("cross-country") && ((juniorsNum + seniorsNum) >= 50)) {
            tax *= 0.75;
        }
        tax*= 0.95;
        System.out.printf("%.2f", tax);
    }
}
