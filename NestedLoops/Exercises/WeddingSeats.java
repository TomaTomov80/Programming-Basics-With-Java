package NestedLoops.Exercises;

import java.util.Scanner;

public class WeddingSeats {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String lastSectorStr = scanner.nextLine();
        int row = Integer.parseInt(scanner.nextLine());
        int seatsOdd = Integer.parseInt(scanner.nextLine());
        char lastSector = lastSectorStr.charAt(0);
        char seatsOddCh = (char)(96+seatsOdd);
        int count = 0;
        for (int i = 'A'; i <= lastSector; i++) {
            for (int j = 1; j <= row; j++) {
                if (j % 2 == 0) {
                    for (int k = 'a'; k <= (seatsOddCh + 2); k++) {
                        System.out.printf("%c%d%c\n", i, j, k);
                        count++;
                    }
                } else {
                    for (int k = 'a'; k <= seatsOddCh; k++) {
                        System.out.printf("%c%d%c\n", i, j, k);
                        count++;
                    }
                }
            }
            row++;
        }
        System.out.printf("%d", count);
    }
}
