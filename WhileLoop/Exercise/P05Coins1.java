package WhileLoop.Exercise;

import java.util.Scanner;

public class P05Coins1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double sumLv = Double.parseDouble(scanner.nextLine());
        double sumStot = Math.floor(sumLv * 100);
        double coins = 0;
        double coins1 = 0;
        if (sumStot >= 200) {
            coins = Math.floor(sumStot / 200);
            sumStot = sumStot - (coins * 200);
        }
        if (sumStot >= 100 && sumStot < 200) {
            coins1 = Math.floor(sumStot / 100);
            sumStot = sumStot - (coins1 * 100);
            coins += coins1;
        }
        if (sumStot >= 50 && sumStot < 100) {
            coins1 = Math.floor(sumStot / 50);
            sumStot = sumStot - (coins1 * 50);
            coins += coins1;
        }
        if (sumStot >= 20 && sumStot < 50) {
            coins1 = Math.floor(sumStot / 20);
            sumStot = sumStot - (coins1 * 20);
            coins += coins1;
        }
        if (sumStot >= 10 && sumStot < 20) {
            coins1 = Math.floor(sumStot / 10);
            sumStot = sumStot - (coins1 * 10);
            coins += coins1;
        }
        if (sumStot >= 5 && sumStot < 10) {
            coins1 = Math.floor(sumStot / 5);
            sumStot = sumStot - (coins1 * 5);
            coins += coins1;
        }
        if (sumStot >= 2 && sumStot < 5) {
            coins1 = Math.floor(sumStot / 2);
            sumStot = sumStot - (coins1 * 2);
            coins += coins1;
        }
        if (sumStot >= 1 && sumStot < 2) {
            coins1 = Math.floor(sumStot);
            coins += coins1;
        }
        System.out.printf("%.0f", coins);
    }
}
