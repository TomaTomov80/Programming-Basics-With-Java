package ForLoop.ExercisesFromWeb;

import java.util.Scanner;

public class NumPowerOnSecondNum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = Integer.parseInt(scanner.nextLine());
        int x = Integer.parseInt(scanner.nextLine());
        int aOnx = 1;
        for (int i = 1; i <= x ; i++) {
            aOnx *= a;
        }
        System.out.println(aOnx);
    }
}
