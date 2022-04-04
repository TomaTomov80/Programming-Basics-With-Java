package WhileLoop.Exercise;

import java.util.Scanner;

public class P03Vacation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double tripPrice = Double.parseDouble(scanner.nextLine());
        double money = Double.parseDouble(scanner.nextLine());
        int spendCount = 0;
        int daysCount = 0;
        while (money < tripPrice) {
            String act = scanner.nextLine();
            double nextMoney = Double.parseDouble(scanner.nextLine());
            switch (act) {
                case "spend":
                    money -= nextMoney;
                    spendCount++;
                    break;
                case "save":
                    money += nextMoney;
                    spendCount = 0;
                    break;
            }
            if (money < 0) {
                money = 0;
            }
            if (spendCount == 5) {
                System.out.println("You can't save the money.");
                System.out.println(daysCount + 1);
                break;
            }
            daysCount++;

        }
        if (money >= tripPrice) {
            System.out.printf("You saved the money for %d days.", daysCount);
        }
    }
}
