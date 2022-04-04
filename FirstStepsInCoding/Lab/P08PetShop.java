package FirstStepsInCoding.Lab;

import java.util.Scanner;

public class P08PetShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int dogsFood = Integer.parseInt(scanner.nextLine());
        int catsFood = Integer.parseInt(scanner.nextLine());
        double tootalSum = (dogsFood * 2.5) + (catsFood * 4);
        System.out.println(tootalSum + " lv.");
    }
}
