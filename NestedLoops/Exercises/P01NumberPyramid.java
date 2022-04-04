package NestedLoops.Exercises;

import java.util.Scanner;

public class P01NumberPyramid {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num2 = 1;
        boolean stop = false;
        int num = Integer.parseInt(scanner.nextLine());
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.printf("%d ", num2);
                if (num2 == num) {
                    stop = true;
                    break;
                }
                num2++;
            }
            if (stop){
                break;
            }
            System.out.println();
        }
    }
}
