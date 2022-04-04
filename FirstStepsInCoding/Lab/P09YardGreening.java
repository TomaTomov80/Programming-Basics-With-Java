package FirstStepsInCoding.Lab;

import java.util.Scanner;

public class P09YardGreening {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double yardArea = Double.parseDouble(scanner.nextLine());
        double yardGreeningTotal = yardArea * 7.61;
        double discount = yardGreeningTotal * .18;
        double finalPrice = yardGreeningTotal - discount;

        System.out.println("The final price is: " + finalPrice + " lv.");
        System.out.println("The discount is: " + discount + " lv.");
    }
}
