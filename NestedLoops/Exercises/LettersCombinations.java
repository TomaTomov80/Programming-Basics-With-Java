package NestedLoops.Exercises;

import java.util.Scanner;

public class LettersCombinations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char firstLetter = scanner.next().charAt(0);
        char secondLetter = scanner.next().charAt(0);
        char thirdLetter = scanner.next().charAt(0);
        int counter = 0;
        for (int i = firstLetter; i <= secondLetter; i++) {
            for (int j = firstLetter; j <= secondLetter; j++) {
                for (int k = firstLetter; k <= secondLetter; k++) {
                    if (i != thirdLetter && j != thirdLetter && k != thirdLetter) {
                        System.out.printf("%c%c%c ", i, j ,k);
                        counter++;
                    }
                }

            }
        }
        System.out.printf("%d", counter);
    }
}
