package WhileLoop.Exercise;

import java.util.Scanner;

public class StreamOfLetters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String letter = scanner.nextLine();
        int countN = 0;
        int countO = 0;
        int countC = 0;
        String word = "";
        while (!letter.equals("End")) {
            switch (letter) {
                case "n":
                    countN++;
                    break;
                case "o":
                    countO++;
                    break;
                case "c":
                    countC++;
                    break;
            }
            if (countN > 1 && letter.equals("n")) {
                word = word + letter;
            }
            if (countO > 1 && letter.equals("o")) {
                word = word + letter;
            }
            if (countC > 1 && letter.equals("c")) {
                word = word + letter;
            }
            char check = letter.charAt(0);
            if (!letter.equals("n") && !letter.equals("o") && !letter.equals("c") && Character.isAlphabetic(check)) {
                word = word + letter;
            }
            if (countC >= 1 && countN >= 1 && countO >= 1) {
                countC = 0;
                countN = 0;
                countO = 0;
                System.out.printf("%s ", word);
                word = "";
            }
            letter = scanner.nextLine();
        }
    }
}
