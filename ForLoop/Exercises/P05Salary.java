package ForLoop.Exercises;

import java.util.Scanner;

public class P05Salary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int salary = Integer.parseInt(scanner.nextLine());
        int fine = 0;
        for (int i = 0; i < n; i++) {
            String siteName = scanner.nextLine();
            switch (siteName) {
                case "Facebook":
                    fine = fine + 150;
                    break;
                case "Instagram":
                    fine = fine + 100;
                    break;
                case "Reddit":
                    fine = fine + 50;
                    break;
            }
            if (salary - fine <= 0) {
                System.out.println("You have lost your salary.");
                break;
            }
        }
        if (salary - fine > 0) {
            System.out.println(salary - fine);
        }
    }
}
