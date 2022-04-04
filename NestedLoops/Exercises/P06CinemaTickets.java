package NestedLoops.Exercises;

import java.util.Scanner;

public class P06CinemaTickets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String movie = scanner.nextLine();
        int standardCount = 0;
        int kidCount = 0;
        int studentCount = 0;
        int fullCount = 0;
        int totalTickets = 0;
        int totalStudent = 0;
        int totalStandard = 0;
        int totalKids = 0;
        while (!movie.equals("Finish")) {
            int freeSits = Integer.parseInt(scanner.nextLine());
            String ticket = scanner.nextLine();
            kidCount = 0;
            studentCount = 0;
            standardCount = 0;
            fullCount = 0;
            while (!ticket.equals("End")) {
                switch (ticket) {
                    case "standard":
                        standardCount++;
                        fullCount++;
                        break;
                    case "kid":
                        kidCount++;
                        fullCount++;
                        break;
                    case "student":
                        studentCount++;
                        fullCount++;
                        break;
                }
                if ((standardCount + kidCount + studentCount) == freeSits) {
                    break;
                }
                ticket = scanner.nextLine();
            }
            totalTickets += fullCount;
            totalKids += kidCount;
            totalStandard += standardCount;
            totalStudent += studentCount;
            System.out.printf("%s - %.2f%% full.\n", movie, 1.0 * fullCount / freeSits * 100);

            movie = scanner.nextLine();
        }
        System.out.printf("Total tickets: %d\n", totalTickets);
        System.out.printf("%.2f%% student tickets.\n", 1.0 * totalStudent / totalTickets * 100);
        System.out.printf("%.2f%% standard tickets.\n", 1.0 * totalStandard / totalTickets * 100);
        System.out.printf("%.2f%% kids tickets.", 1.0 * totalKids / totalTickets * 100);
    }
}
