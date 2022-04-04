package WhileLoop.Exercise;

import java.util.Scanner;

public class P05Coins2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double sumLv = Double.parseDouble(scanner.nextLine());
        double sumStot = Math.floor(sumLv * 100);
        double coins2Lv = Math.floor(sumStot / 200);
        double coins1Lv = Math.floor((sumStot % 200) / 100);
        double coins50 = Math.floor(((sumStot % 200) % 100) / 50);
        double coins20 = Math.floor((((sumStot % 200) % 100) % 50) / 20);
        double coins10 = Math.floor(((((sumStot % 200) % 100) % 50) % 20) / 10);
        double coins5 = Math.floor((((((sumStot % 200) % 100) % 50) % 20) % 10) / 5);
        double coins2 = Math.floor(((((((sumStot % 200) % 100) % 50) % 20) % 10) % 5) / 2);
        double coins1 = Math.floor(((((((sumStot % 200) % 100) % 50) % 20) % 10) % 5) % 2);
        System.out.printf("%.0f",coins2Lv + coins1Lv + coins50 + coins20 + coins10 + coins5 + coins2 + coins1 );
    }
}
