package FirstStepsInCoding.Exercises;

import java.util.Scanner;

public class AgencyProfit {
    public static void main(String[] args) {
        Scanner scannner = new Scanner(System.in);
        String airlineName = scannner.nextLine();
        int ticketsAdultNumber = Integer.parseInt(scannner.nextLine());
        int ticketsKidsNumber = Integer.parseInt(scannner.nextLine());
        double ticketsAdultNetPrice = Double.parseDouble(scannner.nextLine());
        double taxPrice = Double.parseDouble(scannner.nextLine());

        double ticketsKidsNetPrice = ticketsAdultNetPrice * 0.3;
        double ticketsAdultPrice = ticketsAdultNetPrice + taxPrice;
        double ticketsKidstPrice = ticketsKidsNetPrice + taxPrice;
        double allTicketsPrice = (ticketsAdultNumber * ticketsAdultPrice) + (ticketsKidsNumber * ticketsKidstPrice);
        double airlineProfit = allTicketsPrice * 0.2;

        System.out.printf("The profit of your agency from %s tickets is %.2f lv.", airlineName, airlineProfit);


    }
}
