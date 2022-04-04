package FirstStepsInCoding.Exercises;

import java.util.Scanner;

public class HousePainting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double x = Double.parseDouble(scanner.nextLine());
        double y = Double.parseDouble(scanner.nextLine());
        double h = Double.parseDouble(scanner.nextLine());
        double greenPaintArea = (x * x * 2) + (x * y * 2) - (1.2 * 2) - (2 * 1.5 * 1.5);
        double greenPaintLitres = greenPaintArea / 3.4;
        double redPaintArea = (2 * x * y) + (2 * x * h / 2);
        double redPaintLitres = redPaintArea / 4.3;
        System.out.printf("%.2f%n", greenPaintLitres);
        System.out.printf("%.2f%n", redPaintLitres);
    }
}
