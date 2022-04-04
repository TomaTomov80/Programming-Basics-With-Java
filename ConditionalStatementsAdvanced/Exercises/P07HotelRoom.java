package ConditionalStatementsAdvanced.Exercises;

import java.util.Scanner;

public class P07HotelRoom {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String month = scanner.nextLine();
        int nightsNum = Integer.parseInt(scanner.nextLine());
        double studioPrice = 0;
        double appartmentPrice = 0;
        if (month.equals("May") || month.equals("October")) {
            studioPrice = 50;
            appartmentPrice = 65;
            if (nightsNum > 7 && nightsNum <= 14) {
                studioPrice *= 0.95;
            } else if (nightsNum > 14) {
                studioPrice *= 0.7;
            }
        } else if (month.equals("June") || month.equals("September")) {
            studioPrice = 75.2;
            appartmentPrice = 68.7;
            if (nightsNum > 14) {
                studioPrice *= 0.8;
            }
        } else if (month.equals("July") || month.equals("August")) {
            studioPrice = 76;
            appartmentPrice = 77;
        }
        if (nightsNum > 14){
            appartmentPrice *= 0.9;
        }
        double totoalAppartment = nightsNum * appartmentPrice;
        double totoalStudio = nightsNum * studioPrice;
        System.out.printf("Apartment: %.2f lv.%n", totoalAppartment);
        System.out.printf("Studio: %.2f lv.", totoalStudio);
    }
}
