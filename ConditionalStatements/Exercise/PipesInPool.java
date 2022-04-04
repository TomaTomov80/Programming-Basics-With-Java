package ConditionalStatements.Exercise;

import java.util.Scanner;

public class PipesInPool {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int v = Integer.parseInt(scanner.nextLine());
        int p1 = Integer.parseInt(scanner.nextLine());
        int p2 = Integer.parseInt(scanner.nextLine());
        double h = Double.parseDouble(scanner.nextLine());
        double firstPipe = p1 * h;
        double secondPipe = p2 * h;
        double allPipes = firstPipe + secondPipe;
        double firstPipePercent = (firstPipe / allPipes) * 100;
        double secondPipePercent = (secondPipe / allPipes) * 100;
        double diff = Math.abs(allPipes - v);
        if (v >= allPipes) {
            double poolPercent = (allPipes / v) * 100;
            System.out.printf("The pool is %.2f%% full. Pipe 1: %.2f%%. Pipe 2: %.2f%%.", poolPercent, firstPipePercent, secondPipePercent);
        } else {
            System.out.printf("For %.2f hours the pool overflows with %.2f liters.", h, diff);
        }
    }
}
