package ConditionalStatements.Exercise;

import java.util.Scanner;

public class P08LunchBreak {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String series = scanner.nextLine();
        int episodeTime = Integer.parseInt(scanner.nextLine());
        int breakTime = Integer.parseInt(scanner.nextLine());
        double timeForLunch = breakTime / 8.0;
        double timeForRest = breakTime / 4.0;
        double timeForSer = breakTime - timeForLunch - timeForRest;
        double diff = Math.abs(episodeTime - timeForSer);
        diff = Math.ceil(diff);
        if (timeForSer >= episodeTime){
            System.out.printf("You have enough time to watch %s and left with %.0f minutes free time.", series, diff);
        } else{
            System.out.printf("You don't have enough time to watch %s, you need %.0f more minutes.", series, diff);
        }
    }
}
