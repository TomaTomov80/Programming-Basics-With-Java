package ConditionalStatements.Exercise;

import java.util.Scanner;

public class P04ToyShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double tourPrice = Double.parseDouble(scanner.nextLine());
        int puzzelesNum = Integer.parseInt(scanner.nextLine());
        int talkingDollNum = Integer.parseInt(scanner.nextLine());
        int teddyNum = Integer.parseInt(scanner.nextLine());
        int minionNum = Integer.parseInt(scanner.nextLine());
        int truckNum = Integer.parseInt(scanner.nextLine());
        int allToys = puzzelesNum + talkingDollNum + teddyNum + minionNum + truckNum;
        double tottalPrice = (puzzelesNum * 2.6) + (talkingDollNum * 3) + (teddyNum * 4.1) + (minionNum * 8.2) + (truckNum * 2);
        tottalPrice = tottalPrice * 0.9;
        if (allToys >= 50) {
            tottalPrice = tottalPrice * 0.75;
        }
        double diff = Math.abs(tourPrice - tottalPrice);
        if (tottalPrice >= tourPrice) {
            System.out.printf("Yes! %.2f lv left.", diff);
        } else {
            System.out.printf("Not enough money! %.2f lv needed.", diff);
        }
    }
}
