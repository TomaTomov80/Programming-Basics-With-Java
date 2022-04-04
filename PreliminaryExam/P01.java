package PreliminaryExam;

import java.util.Scanner;

public class P01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int fat = Integer.parseInt(scanner.nextLine());
        int prot = Integer.parseInt(scanner.nextLine());
        int carb = Integer.parseInt(scanner.nextLine());
        int call = Integer.parseInt(scanner.nextLine());
        int watter = Integer.parseInt(scanner.nextLine());
        double foodGr = ((1.0 * fat / 100) * call) / 9 + ((1.0 * prot / 100) * call) / 4
                + ((1.0 * carb / 100) * call) / 4;
        double callPerGrFood = call / foodGr;
        double finalCall = ((1.0 * (100 - watter)) / 100) * callPerGrFood ;
        System.out.printf("%.4f", finalCall);
    }
}
