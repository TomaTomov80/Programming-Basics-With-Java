package ForLoop.Exercises;

import java.util.Scanner;

public class P08TennisRanklist {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int initialPoints = Integer.parseInt(scanner.nextLine());
        int pointsWin = 0;
        int win = 0;
        for (int i = 1; i <= n; i++) {
            String result = scanner.nextLine();
            switch (result) {
                case "W":
                    pointsWin += 2000;
                    win++;
                    break;
                case "F":
                    pointsWin += 1200;
                    break;
                case "SF":
                    pointsWin += 720;
                    break;
            }
        }
        System.out.printf("Final points: %d%n", pointsWin + initialPoints);
        System.out.printf("Average points: %d%n", pointsWin / n);
        System.out.printf("%.2f%%", (1.0 * win / n) * 100);
    }
}
