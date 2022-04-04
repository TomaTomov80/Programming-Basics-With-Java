package FirstStepsInCoding.Exercises;

import java.util.Scanner;

public class TrainingLab {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double length = Double.parseDouble(scanner.nextLine());
        double width = Double.parseDouble(scanner.nextLine());
        double desksOnRow = Math.floor((width - 1) / .7);
        double desksOnColumn = Math.floor(length / 1.2);
        double allDesks = desksOnRow * desksOnColumn - 3;
        System.out.println(allDesks);
    }
}
