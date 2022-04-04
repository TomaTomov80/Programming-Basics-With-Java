package FirstStepsInCoding.Exercises;

import java.util.Scanner;

public class TrainingLab1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double length = Double.parseDouble(scanner.nextLine());
        double width = Double.parseDouble(scanner.nextLine());
        double desksOnRowRes = (width - 1) % .7;
        double desksOnRow = ((width - 1) - desksOnRowRes) / 0.7;
        double desksOnColumnRes = length % 1.2;
        double desksOnColumn = (length - desksOnColumnRes) / 1.2;
        double allDesks = desksOnRow * desksOnColumn - 3;
        System.out.println(allDesks);
    }
}

