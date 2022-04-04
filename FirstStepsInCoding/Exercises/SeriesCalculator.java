package FirstStepsInCoding.Exercises;

import java.util.Scanner;

public class SeriesCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String seriesName = scanner.nextLine();
        int seasonNum = Integer.parseInt(scanner.nextLine());
        int episodesNum = Integer.parseInt(scanner.nextLine());
        double episodeTime = Double.parseDouble(scanner.nextLine());
        double episodesFull = episodeTime * 1.2;
        double addTimeLastEpisodes = seasonNum * 10;
        double timeForAll = episodesFull * episodesNum * seasonNum + addTimeLastEpisodes;
        System.out.printf("Total time needed to watch the %s series is %.0f minutes.", seriesName, timeForAll);


    }
}
