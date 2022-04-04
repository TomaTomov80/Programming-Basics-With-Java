package FirstStepsInCoding.Lab;

import java.util.Scanner;

public class Proba {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double num = 0;
        while (num >= 0) {
            num = Double.parseDouble(scanner.nextLine());
            System.out.printf("Result: %.2f\n", num * 2);
        }
        System.out.println("Negative number!");
        scanner.close();
    }
}