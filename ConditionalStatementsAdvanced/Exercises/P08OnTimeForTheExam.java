package ConditionalStatementsAdvanced.Exercises;

import java.util.Scanner;

public class P08OnTimeForTheExam {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int examHour = Integer.parseInt(scanner.nextLine());
        int examMinutes = Integer.parseInt(scanner.nextLine());
        int arrivalHour = Integer.parseInt(scanner.nextLine());
        int arrivalMinute = Integer.parseInt(scanner.nextLine());
        int examMinutesAll = examHour * 60 + examMinutes;
        int arrivalMinutesAll = arrivalHour * 60 + arrivalMinute;
        int diff = Math.abs(examMinutesAll - arrivalMinutesAll);
        int hourDiff = diff / 60;
        int minutesDiff = diff % 60;
        if (arrivalMinutesAll < examMinutesAll && diff > 30) {
            System.out.println("Early");
            if (hourDiff == 0) {
                System.out.printf("%d minutes before the start", diff);
            } else {
                System.out.printf("%d:%02d hours before the start", hourDiff, minutesDiff);
            }
        } else if (arrivalMinutesAll <= examMinutesAll && (diff <= 30 && diff >= 0)) {
            if (hourDiff == 0 && minutesDiff == 0) {
                System.out.println("on time");
            } else {
                System.out.println("On time");
                System.out.printf("%d minutes before the start", diff);
            }
        } else {
            System.out.println("Late");
            if (hourDiff == 0) {
                System.out.printf("%d minutes after the start", diff);
            } else {
                System.out.printf("%d:%02d hours after the start", hourDiff, minutesDiff);
            }
        }
    }
}
