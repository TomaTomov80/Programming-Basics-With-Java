package FirstStepsInCoding.Exercises;

import java.util.Scanner;

public class PoolDay {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int people = Integer.parseInt(scanner.nextLine());
        double entryTax = Double.parseDouble(scanner.nextLine());
        double chairTax = Double.parseDouble(scanner.nextLine());
        double umbrelaTax = Double.parseDouble(scanner.nextLine());

        double peopleTax = people * entryTax;
        double chairNumber = Math.ceil(people * 0.75);
        double umbelaNumber = Math.ceil(people * 0.5);
        double finalPrice = peopleTax + chairNumber * chairTax + umbelaNumber * umbrelaTax;
        System.out.printf("%.2f lv.", finalPrice);
    }
}
