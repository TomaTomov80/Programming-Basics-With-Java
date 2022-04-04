package ForLoop.Exercises;

import java.util.Scanner;

public class ClockPart2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int h = 0;
        int m = 0;
        int s = 0;
        for (int i = 1; i < 86401; i++) {
            System.out.printf("%d : %d : %d\n", h, m, s);
            s++;
            if (s > 59 && m < 59) {
                m++;
                s = 0;
            } else if (s > 59) {
                h++;
                m = 0;
                s = 0;
            }
        }
    }
}
