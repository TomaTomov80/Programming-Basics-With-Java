package ConditionalStatementsAdvanced.Exercises;

import java.util.Scanner;

public class SchoolCamp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String season = scanner.nextLine();
        String groupType = scanner.nextLine();
        int studentNum = Integer.parseInt(scanner.nextLine());
        int nightsNum = Integer.parseInt(scanner.nextLine());
        double price = 0;
        String sport = "";
        switch (season) {
            case "Winter":
                switch (groupType) {
                    case "girls":
                        price = 9.6;
                        sport = "Gymnastics";
                        break;
                    case "boys":
                        price = 9.6;
                        sport = "Judo";
                        break;
                    case "mixed":
                        price = 10;
                        sport = "Ski";
                        break;
                }
                break;
            case "Spring":
                switch (groupType) {
                    case "girls":
                        price = 7.2;
                        sport = "Athletics";
                        break;
                    case "boys":
                        price = 7.2;
                        sport = "Tennis";
                        break;
                    case "mixed":
                        price = 9.5;
                        sport = "Cycling";
                        break;
                }
                break;
            case "Summer":
                switch (groupType) {
                    case "girls":
                        price = 15;
                        sport = "Volleyball";
                        break;
                    case "boys":
                        price = 15;
                        sport = "Football";
                        break;
                    case "mixed":
                        price = 20;
                        sport = "Swimming";
                        break;
                }
                break;
        }
        if (studentNum >= 50){
            price *= 0.5;
        }else if (studentNum >=20 && studentNum<50){
            price *= 0.85;
        } else if (studentNum >=10 && studentNum <20){
            price *= 0.95;
        }
        price = price * studentNum * nightsNum;
        System.out.printf("%s %.2f lv.", sport, price);

    }
}
