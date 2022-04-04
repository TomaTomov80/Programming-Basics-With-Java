package ForLoop.Exercises;

import java.util.Scanner;

public class Bills {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        double electrTotal = 0;
        double waterTotal = 0;
        double internetTotal = 0;
         for (int i = 1; i <= n; i++) {
            double electBill = Double.parseDouble(scanner.nextLine());
            electrTotal += electBill;
        }
        waterTotal = n * 20;
        internetTotal = n * 15;
        System.out.printf("Electricity: %.2f lv\n", electrTotal);
        System.out.printf("Water: %.2f lv\n", waterTotal);
        System.out.printf("Internet: %.2f lv\n", internetTotal);
        System.out.printf("Other: %.2f lv\n", (electrTotal + waterTotal + internetTotal)* 1.2);
        System.out.printf("Average: %.2f lv", (electrTotal + waterTotal + internetTotal + (electrTotal + waterTotal + internetTotal)* 1.2) / n);
    }
}
