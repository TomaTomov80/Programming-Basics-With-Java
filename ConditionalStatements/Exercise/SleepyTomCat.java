package ConditionalStatements.Exercise;

import java.util.Scanner;

public class SleepyTomCat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int dayOff = Integer.parseInt(scanner.nextLine());
        int workDay = 365 - dayOff;
        int timeForPlay = (dayOff * 127) + (workDay * 63);
        if (timeForPlay > 30000) {
            int timeInMin = timeForPlay - 30000;
            int hours = timeInMin / 60;
            int minutes = timeInMin % 60;
            System.out.println("Tom will run away");
            System.out.printf("%d hours and %d minutes more for play", hours, minutes);
        } else {
            int timeInPlus = 30000 - timeForPlay;
            int hours = timeInPlus / 60;
            int minutes = timeInPlus % 60;
            System.out.println("Tom sleeps well");
            System.out.printf("%d hours and %d minutes less for play", hours, minutes);

        }

    }
}
