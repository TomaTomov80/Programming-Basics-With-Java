package ConditionalStatements.Exercise;

import java.util.Scanner;

public class P02BonusScore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int pointsInitial = Integer.parseInt(scanner.nextLine());
        double bonus = 0;
        if (pointsInitial <= 100) {
            bonus = 5;
        } else if (pointsInitial < 1000) {
            bonus = pointsInitial * 0.2;
        } else {
            bonus = pointsInitial * 0.1;
        }
        if (pointsInitial % 2 == 0) {
            bonus += 1;
        } else if (pointsInitial % 10 == 5) {
            bonus += 2;
        }
        System.out.println(bonus);
        System.out.println(pointsInitial + bonus);
    }
}
