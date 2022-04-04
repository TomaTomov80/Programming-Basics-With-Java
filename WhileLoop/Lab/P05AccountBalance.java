package WhileLoop.Lab;

import java.util.Scanner;

public class P05AccountBalance {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String fee = scanner.nextLine();
        double sum = 0;
        while (!fee.equals("NoMoreMoney")) {
            double feeDoub = Double.parseDouble(fee);
            if (feeDoub < 0) {
                System.out.println("Invalid operation!");
                break;
            }
            System.out.printf("Increase: %.2f\n", feeDoub);
            sum += feeDoub;
            fee = scanner.nextLine();
        }
        System.out.printf("Total: %.2f", sum);
    }
}
