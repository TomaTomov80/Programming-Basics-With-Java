package ConditionalStatementsAdvanced.Exercises;

import java.util.Scanner;

public class Vacation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budget = Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine();
        String placeType = "";
        String place = "";
        if ( budget<=1000){
            placeType = "Camp";
            switch(season){
                case "Summer":
                  place = "Alaska";
                  budget *= 0.65;
                  break;
                case "Winter":
                    place = "Morocco";
                    budget *= 0.45;
                    break;
            }
        } else if ( budget > 1000 && budget <=3000){
            placeType = "Hut";
            switch(season){
                case "Summer":
                    place = "Alaska";
                    budget *= 0.8;
                    break;
                case "Winter":
                    place = "Morocco";
                    budget *= 0.6;
                    break;
            }
        } else if ( budget > 3000){
            placeType = "Hotel";
            switch(season){
                case "Summer":
                    place = "Alaska";
                    budget *= 0.9;
                    break;
                case "Winter":
                    place = "Morocco";
                    budget *= 0.9;
                    break;
            }
        }
        System.out.printf("%s - %s - %.2f", place, placeType, budget);
    }
}
