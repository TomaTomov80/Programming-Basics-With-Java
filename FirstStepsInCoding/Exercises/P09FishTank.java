package FirstStepsInCoding.Exercises;

import java.util.Scanner;

public class P09FishTank {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int length = Integer.parseInt(scanner.nextLine());
        int width = Integer.parseInt(scanner.nextLine());
        int heigth = Integer.parseInt(scanner.nextLine());
        double percent = Double.parseDouble(scanner.nextLine());
        double volume = length * width * heigth;
        double volumeInLitres = volume * 0.001;
        double litresNeeded = volumeInLitres * (1 - percent/100);
        System.out.println(litresNeeded);
    }
}
