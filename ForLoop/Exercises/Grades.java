package ForLoop.Exercises;

import java.util.Scanner;

public class Grades {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int grade2to3 = 0;
        int grade3to4 = 0;
        int grade4to5 = 0;
        int gradeTopSt = 0;
        double gradeSum = 0;
        for (int i = 1; i <= n; i++) {
            double grade = Double.parseDouble(scanner.nextLine());
            if (grade < 3) {
                grade2to3++;
            } else if (grade < 4) {
                grade3to4++;
            } else if (grade < 5) {
                grade4to5++;
            } else {
                gradeTopSt++;
            }
            gradeSum += grade;
        }
        System.out.printf("Top students: %.2f%%\n", (1.0 * gradeTopSt / n) * 100);
        System.out.printf("Between 4.00 and 4.99: %.2f%%\n", (1.0 * grade4to5 / n) * 100);
        System.out.printf("Between 3.00 and 3.99: %.2f%%\n", (1.0 * grade3to4 / n) * 100);
        System.out.printf("Fail: %.2f%%\n", (1.0 * grade2to3 / n) * 100);
        System.out.printf("Average: %.2f", 1.0 * gradeSum / n);
    }
}
