package FirstStepsInCoding.Exercises;

import java.util.Scanner;

public class BasketballEquipment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int yearTax = Integer.parseInt(scanner.nextLine());
        double sneakersPrice = yearTax * 0.6;
        double equipmentPrice = sneakersPrice * 0.8;
        double ballPrice = equipmentPrice * 0.25;
        double accesoriesPrice = ballPrice * 0.2;
        double fullPrice = sneakersPrice + equipmentPrice + ballPrice + accesoriesPrice + yearTax;
        System.out.printf("%.2f", fullPrice);

    }
}
