package FirstStepsInCoding.Exercises;

import java.util.Scanner;

public class P07FoodDelivery {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int chckenMenuNum = Integer.parseInt(scanner.nextLine());
        int fishMenuNum = Integer.parseInt(scanner.nextLine());
        int vegMenuNum = Integer.parseInt(scanner.nextLine());
        double chickenMenuPrice = chckenMenuNum * 10.35;
        double fishMenuPrice = fishMenuNum * 12.4;
        double vegMenuPrice = vegMenuNum * 8.15;
        double totalPriceMenu = chickenMenuPrice + fishMenuPrice + vegMenuPrice;
        double desertPrice = totalPriceMenu * 0.2;
        double totalPrice = totalPriceMenu + desertPrice + 2.5;
        System.out.println(totalPrice);
    }
}
