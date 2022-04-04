package ConditionalStatementsAdvanced.Exercises;

import java.util.Scanner;

public class MatchTickets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budget = Double.parseDouble(scanner.nextLine());
        String category = scanner.nextLine();
        int personNum = Integer.parseInt(scanner.nextLine());
        double moneyForTickets = 0;
        double moneyTicketsNeeded = 0;
        if (personNum >= 1 && personNum <= 4) {
            moneyForTickets = budget * 0.25;
        } else if (personNum >= 5 && personNum <= 9) {
            moneyForTickets = budget * 0.4;
        } else if (personNum >= 10 && personNum <= 24) {
            moneyForTickets = budget * 0.5;
        } else if (personNum >= 25 && personNum <= 49) {
            moneyForTickets = budget * 0.6;
        } else if (personNum > 50){
            moneyForTickets = budget * 0.75;
        }
        switch (category){
            case "VIP":
                moneyTicketsNeeded = personNum * 499.99;
                break;
            case "Normal":
                moneyTicketsNeeded = personNum * 249.99;
                break;
        }
        double diff = Math.abs(moneyForTickets - moneyTicketsNeeded );
        if ( moneyForTickets >= moneyTicketsNeeded){
            System.out.printf("Yes! You have %.2f leva left.", diff);
        } else{
            System.out.printf("Not enough money! You need %.2f leva.", diff);
        }
    }
}
