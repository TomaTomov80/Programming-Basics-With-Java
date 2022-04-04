package FirstStepsInCoding.Exercises;

import java.util.Scanner;

public class P06Repainting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nylonNeeded = Integer.parseInt(scanner.nextLine());
        int paintNeeded = Integer.parseInt(scanner.nextLine());
        int thinnerNeeded = Integer.parseInt(scanner.nextLine());
        int oursPerJob = Integer.parseInt(scanner.nextLine());
        double nylonPrice = (nylonNeeded + 2) * 1.5;
        double paintPrice = (paintNeeded * 1.1) * 14.5;
        double thinnerPrice = thinnerNeeded * 5.0;
        double totalSumMaterials = nylonPrice + paintPrice + thinnerPrice + 0.4;
        double totalSumWork = totalSumMaterials * 0.3 * oursPerJob;
        double totalPrice = totalSumMaterials + totalSumWork;
        System.out.println(totalPrice);
    }
}
