package ForLoop.Lab;

import java.util.Scanner;

public class P05CharacterSequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        int n = text.length();
        for (int i = 0; i < n; i++) {
            System.out.println(text.charAt(i));
        }
    }
}
