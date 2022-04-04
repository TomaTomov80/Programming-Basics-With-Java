package WhileLoop.Exercise;

import java.util.Scanner;

public class P05Coins {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double sumLv = Double.parseDouble(scanner.nextLine());
        double sumStot = Math.floor(sumLv * 100);
        double coins = 0;
        while (sumStot > 0) {
            if (sumStot >= 200) {
                coins++;
                sumStot -= 200;
            }
            if (sumStot >= 100 && sumStot < 200) {
                coins++;
                sumStot -= 100;
            }
            if (sumStot >= 50 && sumStot < 100) {
                coins++;
                sumStot -= 50;
            }
            if (sumStot >= 20 && sumStot < 50) {
                coins++;
                sumStot -= 20;
            }
            if (sumStot >= 10 && sumStot < 20) {
                coins++;
                sumStot -= 10;
            }
            if (sumStot >= 5 && sumStot < 10) {
                coins++;
                sumStot -= 5;
            }
            if (sumStot >= 2 && sumStot < 5) {
                coins++;
                sumStot -= 2;
            }
            if (sumStot >= 1 && sumStot < 2) {
                coins++;
                sumStot -=  1;
            }
        }
        System.out.printf("%.0f", coins);
    }
}
