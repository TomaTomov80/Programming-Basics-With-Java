package WhileLoop.Exercise;

import java.util.Scanner;

public class Proba2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double trunkCapacity = Double.parseDouble(scanner.nextLine());

        String input = scanner.nextLine();
        int counter = 0;
        boolean noSpace = false;
        int freeSpace = 0;

        while (!input.equals("End")) {
            double suitcaseVolume = Double.parseDouble(input);
            if (trunkCapacity <= 0) {
                noSpace = true;
                counter -= 1;
                break;
            }
            counter++;
            if (counter % 3 == 0) {
                trunkCapacity -= suitcaseVolume * 1.1;
            } else {
                trunkCapacity -= suitcaseVolume;
            }
            input = scanner.nextLine();
        }

        if (noSpace) {
            System.out.println("No more space!");
        } else {
            System.out.println("Congratulations! All suitcases are loaded!");
        }
        System.out.printf("Statistic: %d suitcases loaded.", counter);

    }
}