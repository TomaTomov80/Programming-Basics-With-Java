package NestedLoops.Exercises;

import java.util.Scanner;

public class P04TrainTheTrainers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        String namePres = scanner.nextLine();
        int count = 0;
        double sumTotal = 0;
        while (!namePres.equals("Finish")) {
            double sum = 0;
            double average = 0;
            for (int i = 1; i <= n; i++) {
                double mark = Double.parseDouble(scanner.nextLine());
                sum += mark;
                count++;
            }
            average = sum / n;
            System.out.printf("%s - %.2f.\n", namePres, average);
            sumTotal += sum;
            namePres = scanner.nextLine();
        }
        System.out.printf("Student's final assessment is %.2f.", sumTotal / count);
    }
}
