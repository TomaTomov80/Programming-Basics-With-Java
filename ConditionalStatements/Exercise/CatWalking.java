package ConditionalStatements.Exercise;

import java.util.Scanner;

public class CatWalking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int minutesPerDay = Integer.parseInt(scanner.nextLine());
        int walkPerDay = Integer.parseInt(scanner.nextLine());
        int caloriesPlus = Integer.parseInt(scanner.nextLine());
        double caloriesMinus = minutesPerDay * walkPerDay * 5 ;
        double caloriesPlusHalf = caloriesPlus / 2.0;
        if (caloriesMinus >= caloriesPlusHalf){
            System.out.printf("Yes, the walk for your cat is enough. Burned calories per day: %.0f.", caloriesMinus);
        } else {
            System.out.printf("No, the walk for your cat is not enough. Burned calories per day: %.0f.", caloriesMinus);
        }
    }
}
