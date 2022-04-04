package PreliminaryExam;

import java.util.Scanner;

public class P05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String sleep = scanner.nextLine();
        int days = 1;
        int metCl = 0;
        while (!sleep.equals("END")) {

            int met = Integer.parseInt(scanner.nextLine());
            switch (sleep) {
                case "Yes":
                    days++;
            }
            if (days > 5) {
                break;
            }
            metCl += met;
            if ((5364 + metCl >= 8848)) {
                System.out.printf("Goal reached for %d days!", days);
                break;
            }
            sleep = scanner.nextLine();

        }
        if ( days > 5 || sleep.equals("END")){
            System.out.println("Failed!");
            System.out.printf("%d", (5364 + metCl));
        }


    }
}
