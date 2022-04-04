package PreliminaryExam;

import java.util.Scanner;

public class P02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int days = Integer.parseInt(scanner.nextLine());
        int kgsLeft = Integer.parseInt(scanner.nextLine());
        double foodPerDay1 = Double.parseDouble(scanner.nextLine());
        double foodPerDay2 = Double.parseDouble(scanner.nextLine());
        double foodPerDay3 = Double.parseDouble(scanner.nextLine());
        double foodNeeded = (days * foodPerDay1) + (days * foodPerDay2) + (days * foodPerDay3);
        if (foodNeeded <= kgsLeft){
            System.out.printf("%.0f kilos of food left.", Math.floor(kgsLeft - foodNeeded));
        } else {
            System.out.printf("%.0f more kilos of food are needed.", Math.ceil(foodNeeded - kgsLeft));
        }
    }
}
