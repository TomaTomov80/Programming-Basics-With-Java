package Exam;

import java.util.Scanner;

public class P02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int procNum = Integer.parseInt(scanner.nextLine());
        int labNum = Integer.parseInt(scanner.nextLine());
        int daysNum = Integer.parseInt(scanner.nextLine());
        int workHours = labNum * daysNum * 8;
        int procProduced = workHours / 3;
        if (procProduced < procNum) {
            System.out.printf("Losses: -> %.2f BGN", (procNum - procProduced) * 110.1);
        } else {
            System.out.printf("Profit: -> %.2f BGN", (procProduced - procNum) * 110.1);
        }
    }
}
