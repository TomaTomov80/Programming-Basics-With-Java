package ConditionalStatements.Exercise;

import java.util.Scanner;

public class Harvest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = Integer.parseInt(scanner.nextLine());
        double y = Double.parseDouble(scanner.nextLine());
        int z = Integer.parseInt(scanner.nextLine());
        int workerNum = Integer.parseInt(scanner.nextLine());
        double grapesTotal = x * y;
        double grapesForWine = grapesTotal * 0.4;
        double wineLitres = grapesForWine / 2.5;
        double diff = Math.abs(wineLitres - z);
        if (wineLitres < z) {
            double litresInLow = Math.floor(diff);
            System.out.printf("It will be a tough winter! More %.0f liters wine needed.", litresInLow);
        } else {
            double litresInPlus = Math.ceil(diff);
            double winePerWorker = Math.ceil(litresInPlus / workerNum);
            wineLitres = Math.floor(wineLitres);
            System.out.printf("Good harvest this year! Total wine: %.0f liters.%n", wineLitres);
            System.out.printf("%.0f liters left -> %.0f liters per person.", litresInPlus, winePerWorker);
        }


    }
}
