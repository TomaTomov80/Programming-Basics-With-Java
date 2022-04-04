package ConditionalStatements.Exercise;

import java.util.Scanner;

public class Firm {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int hoursNeeded = Integer.parseInt(scanner.nextLine());
        int daysNum = Integer.parseInt(scanner.nextLine());
        int workersOverTime = Integer.parseInt(scanner.nextLine());
        double hoursPerProj = daysNum * 0.9 * 8;
        double overTime = workersOverTime * daysNum * 2;
        double hoursAll = hoursPerProj + overTime;
        double diff = Math.abs(hoursNeeded - hoursAll);
        if (hoursAll >= hoursNeeded) {
            diff = Math.floor(diff);
            System.out.printf("Yes!%.0f hours left.", diff);
        } else{
            diff = Math.ceil(diff);
            System.out.printf("Not enough time!%.0f hours needed.", diff);
        }


    }
}
