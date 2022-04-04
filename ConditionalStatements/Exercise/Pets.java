package ConditionalStatements.Exercise;

import java.util.Scanner;

public class Pets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int daysNum = Integer.parseInt(scanner.nextLine());
        int foodLeft = Integer.parseInt(scanner.nextLine());
        double foodPerDayDog = Double.parseDouble(scanner.nextLine());
        double foodPerDayCat = Double.parseDouble(scanner.nextLine());
        double foodPerDayTurtle = Double.parseDouble(scanner.nextLine());
        double foodDogAll = daysNum * foodPerDayDog;
        double foodCatAll = daysNum * foodPerDayCat;
        double foodTutleAll = (daysNum * foodPerDayTurtle) / 1000;
        double foodNeeded = foodDogAll + foodCatAll + foodTutleAll;
        double diff = Math.abs(foodLeft - foodNeeded);
        if (foodLeft >= foodNeeded) {
            diff = Math.floor(diff);
            System.out.printf("%.0f kilos of food left.", diff);
        } else {
            diff = Math.ceil(diff);
            System.out.printf("%.0f more kilos of food are needed.", diff);
        }
    }
}
