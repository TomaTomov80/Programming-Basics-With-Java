package WhileLoop.Exercise;

import java.util.Scanner;

public class Dishwasher {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int detergentNum = Integer.parseInt(scanner.nextLine());
        int detergentVolume = detergentNum * 750;
        int dishes = 0;
        int pots = 0;
        int days = 0;
        while (detergentVolume >= 0) {
            int currPots = 0;
            int currDishes = 0;
            String num = scanner.nextLine();
            if (num.equals("End")) {
                break;
            }
            int numInt = Integer.parseInt(num);
            days++;
            if (days % 3 == 0) {
                pots = pots + numInt;
                currPots = numInt;
            } else {
                dishes = dishes + numInt;
                currDishes = numInt;
            }
            detergentVolume = detergentVolume - (currDishes * 5) - (currPots * 15);

        }
        if (detergentVolume >= 0) {
            System.out.println("Detergent was enough!");
            System.out.printf("%d dishes and %d pots were washed.\n", dishes, pots);
            System.out.printf("Leftover detergent %d ml.", detergentVolume);
        } else {
            System.out.printf("Not enough detergent, %d ml. more necessary!", Math.abs(detergentVolume));
        }
    }
}
