package Exam;

import java.util.Scanner;

public class P05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int foodPres = Integer.parseInt(scanner.nextLine());
        String foodEatStr = scanner.nextLine();
        foodPres *= 1000;
        while (!foodEatStr.equals("Adopted")){
            int foodEat = Integer.parseInt(foodEatStr);
            foodPres -= foodEat;
            foodEatStr = scanner.nextLine();
        }
        if (foodPres < 0 ){
            System.out.printf("Food is not enough. You need %d grams more.", Math.abs(foodPres));
        } else {
            System.out.printf("Food is enough! Leftovers: %d grams.", foodPres);
        }
    }
}
