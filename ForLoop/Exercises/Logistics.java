package ForLoop.Exercises;

import java.util.Scanner;

public class Logistics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int busTons = 0;
        int truckTons = 0;
        int trainTons = 0;
        for (int i = 1; i <= n; i++) {
            int weigth = Integer.parseInt(scanner.nextLine());
            if (weigth <= 3) {
                busTons += weigth;
            } else if (weigth <= 11) {
                truckTons += weigth;
            } else {
                trainTons += weigth;
            }
        }
        System.out.printf("%.2f\n", (1.0*(busTons * 200 + truckTons * 175 + trainTons * 120)) / (busTons + truckTons + trainTons));
        System.out.printf("%.2f%%\n", ((1.0 * busTons) / (busTons + truckTons + trainTons)) * 100);
        System.out.printf("%.2f%%\n", ((1.0 * truckTons) / (busTons + truckTons + trainTons)) * 100);
        System.out.printf("%.2f%%\n", ((1.0 * trainTons) / (busTons + truckTons + trainTons)) * 100);
    }
}
