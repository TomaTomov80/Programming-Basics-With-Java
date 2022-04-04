package FirstStepsInCoding.Lab;

import java.util.Scanner;

public class P04InchesToCentimeters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double inches = Double.parseDouble(scanner.nextLine());
        double inchToCentimeter = inches * 2.54;
        System.out.println(inchToCentimeter);
    }
}
