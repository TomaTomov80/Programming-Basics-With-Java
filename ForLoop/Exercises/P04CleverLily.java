package ForLoop.Exercises;

import java.util.Scanner;

public class P04CleverLily {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        double washMachPrice = Double.parseDouble(scanner.nextLine());
        int toyPrice = Integer.parseInt(scanner.nextLine());
        int money = 0;
        int toysCount = 0;
        double totMoney = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                money = money + ((i / 2) * 10) - 1;
            } else {
                toysCount++;
            }
        }
        totMoney = toysCount * toyPrice + money;
        double diff = Math.abs(totMoney - washMachPrice);
        if (totMoney >= washMachPrice) {
            System.out.printf("Yes! %.2f", diff);
        } else {
            System.out.printf("No! %.2f", diff);
        }
    }
}
