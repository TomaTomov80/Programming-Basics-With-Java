package FirstStepsInCoding.Exercises;

import java.util.Scanner;

public class P08BasketballEquipment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int yearTax = Integer.parseInt(scanner.nextLine());
        double shoesPrice = yearTax - yearTax * 0.40;
        double dressPrice = shoesPrice - shoesPrice * 0.20;
        double ballPrice = dressPrice / 4;
        double accessories = ballPrice / 5;
        double totalPrice = shoesPrice + dressPrice + ballPrice + accessories + yearTax;
        System.out.println(totalPrice);

    }
}
