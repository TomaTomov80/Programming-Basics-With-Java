package ForLoop.Exercises;

import java.util.Scanner;

public class P06Oscars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String actorName = scanner.nextLine();
        double academyPoints = Double.parseDouble(scanner.nextLine());
        int n = Integer.parseInt(scanner.nextLine());
        double pointsTotal = academyPoints;
        double pointsJudge = 0;
        for (int i = 0; i < n; i++) {
            String judgeName = scanner.nextLine();
            double points = Double.parseDouble(scanner.nextLine());
            pointsJudge = (judgeName.length() * points) / 2;
            pointsTotal = pointsTotal + pointsJudge;
            if (pointsTotal > 1250.5) {
                System.out.printf("Congratulations, %s got a nominee for leading role with %.1f!", actorName, pointsTotal);
                break;
            }
        }
        if (pointsTotal <= 1250.5) {
            System.out.printf("Sorry, %s you need %.1f more!", actorName, 1250.5 - pointsTotal);
        }
    }
}
