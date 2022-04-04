package ConditionalStatements.Exercise;

import java.util.Scanner;

public class MountainRun {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double recordTime = Double.parseDouble(scanner.nextLine());
        double distance = Double.parseDouble(scanner.nextLine());
        double timePerMeter = Double.parseDouble(scanner.nextLine());
        double slowTimes = Math.floor(distance / 50);
        double timeGeorge = (distance * timePerMeter) + (slowTimes * 30);
        double diff = Math.abs(timeGeorge - recordTime);
        if ( timeGeorge < recordTime){
            System.out.printf("Yes! The new record is %.2f seconds.", timeGeorge);
        } else{
            System.out.printf("No! He was %.2f seconds slower.", diff);
        }
    }
}
