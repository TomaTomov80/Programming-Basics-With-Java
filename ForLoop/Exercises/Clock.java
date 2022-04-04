package ForLoop.Exercises;

import java.util.Scanner;

public class Clock {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = 0;
        int s = 0;
        for (int i = 1; i < 1441; i++) {
            System.out.printf("%d : %d\n", m, s);
            s++;
            if (s > 59) {
                m++;
                s = 0;
            }
        }
    }
}
