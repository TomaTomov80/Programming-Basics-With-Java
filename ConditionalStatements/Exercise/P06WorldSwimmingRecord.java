package ConditionalStatements.Exercise;

import java.util.Scanner;

public class P06WorldSwimmingRecord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double swimmRec = Double.parseDouble(scanner.nextLine());
        double distance = Double.parseDouble(scanner.nextLine());
        double timePerOneMeter = Double.parseDouble(scanner.nextLine());
        double delayNum = Math.floor(distance / 15);
        double delay = delayNum * 12.5;
        double finalTime = (distance * timePerOneMeter) + delay;
        double diff = Math.abs(finalTime - swimmRec);
        if (swimmRec > finalTime) {
            System.out.printf("Yes, he succeeded! The new world record is %.2f seconds.", finalTime);
        } else {
            System.out.printf("No, he failed! He was %.2f seconds slower.", diff);
        }
    }
}
