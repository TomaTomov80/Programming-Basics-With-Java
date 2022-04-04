package ForLoop.Lab;

import java.util.Scanner;

public class P06VowelsSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        int n = text.length();
        int sum = 0;
        int valueChar = 0;
        for (int i = 0; i < n; i++) {
            char charCheck = text.charAt(i);
            switch (charCheck) {
                case 'a':
                    valueChar = 1;
                    break;
                case 'e':
                    valueChar = 2;
                    break;
                case 'i':
                    valueChar = 3;
                    break;
                case 'o':
                    valueChar = 4;
                    break;
                case 'u':
                    valueChar = 5;
                    break;
                default:
                    valueChar = 0;
                    break;
            }
            sum = sum + valueChar;
        }

        System.out.println(sum);
    }
}
