package ForLoop.Exercises;

import java.util.Scanner;

public class FootballLeague {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int stadiumCap = Integer.parseInt(scanner.nextLine());
        int n = Integer.parseInt(scanner.nextLine());
        int sectorA = 0;
        int sectorB = 0;
        int sectorV = 0;
        int sectorG = 0;
        for (int i = 1; i <= n; i++) {
            String sector = scanner.nextLine();
            switch (sector) {
                case "A":
                    sectorA++;
                    break;
                case "B":
                    sectorB++;
                    break;
                case "V":
                    sectorV++;
                    break;
                case "G":
                    sectorG++;
                    break;
            }

        }
        System.out.printf("%.2f%%\n", (1.0 * sectorA / n) * 100);
        System.out.printf("%.2f%%\n", (1.0 * sectorB / n) * 100);
        System.out.printf("%.2f%%\n", (1.0 * sectorV / n) * 100);
        System.out.printf("%.2f%%\n", (1.0 * sectorG / n) * 100);
        System.out.printf("%.2f%%", (1.0 * n / stadiumCap) * 100);
    }
}
