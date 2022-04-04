package FirstStepsInCoding.Exercises;

import java.util.Scanner;

public class MovieProfit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String movieName = scanner.nextLine();
        int daysNum = Integer.parseInt(scanner.nextLine());
        int ticketsNum = Integer.parseInt(scanner.nextLine());
        double ticketPrice = Double.parseDouble(scanner.nextLine());
        int cinemaFee = Integer.parseInt(scanner.nextLine());
        double ticketsPerDayIncome = ticketsNum * ticketPrice;
        double fullIncome = ticketsPerDayIncome * daysNum;
        double cinemaFeeFull = fullIncome * cinemaFee * 1.0 / 100;
        double movieIncome = fullIncome - cinemaFeeFull;
        System.out.printf("The profit from the movie %s is %.2f lv.", movieName, movieIncome);

    }
}
