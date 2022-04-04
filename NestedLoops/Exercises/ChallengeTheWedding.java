package NestedLoops.Exercises;

import java.util.Scanner;

public class ChallengeTheWedding {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int men = Integer.parseInt(scanner.nextLine());
        int women = Integer.parseInt(scanner.nextLine());
        int table = Integer.parseInt(scanner.nextLine());
        for (int i = 1; i <= men; i++) {
            for (int j = 1; j <= women; j++) {
                if (table > 0)
                    System.out.printf("(%d <-> %d) ", i, j);
                table--;
            }
        }
    }
}
