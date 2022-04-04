package ConditionalStatements.Exercise;

import java.util.Scanner;

public class P05GodzillaVsKong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double filmBudget = Double.parseDouble(scanner.nextLine());
        int statistNum = Integer.parseInt(scanner.nextLine());
        double clothPrStatist = Double.parseDouble(scanner.nextLine());
        double decorPrice = filmBudget * 0.1;
        double clothAllStatists = statistNum * clothPrStatist;
        if (statistNum > 150) {
            clothAllStatists *= 0.9;
        }
        double expenses = decorPrice + clothAllStatists;
        double diff = Math.abs(filmBudget - expenses);
        if (filmBudget < expenses) {
            System.out.println("Not enough money!");
            System.out.printf("Wingard needs %.2f leva more.", diff);
        } else {
            System.out.println("Action!");
            System.out.printf("Wingard starts filming with %.2f leva left.", diff);
        }


    }
}
