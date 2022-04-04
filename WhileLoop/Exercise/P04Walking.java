package WhileLoop.Exercise;

import java.util.Scanner;

public class P04Walking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String steps = scanner.nextLine();
        int allSteps = 0;
        while (!steps.equals("Going home")) {
            int stepsInt = Integer.parseInt(steps);
            allSteps += stepsInt;
            if (allSteps >= 10000) {
                break;
            }
            steps = scanner.nextLine();
        }
        if (steps.equals("Going home")) {
            int stepsInt = Integer.parseInt(scanner.nextLine());
            allSteps += stepsInt;
        }
        if (allSteps >= 10000) {
            System.out.println("Goal reached! Good job!");
            System.out.printf("%d steps over the goal!", allSteps - 10000);
        } else {
            System.out.printf("%d more steps to reach goal.", 10000 - allSteps);
        }
    }
}


