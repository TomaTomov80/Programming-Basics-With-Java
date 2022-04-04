package WhileLoop.Exercise;

import java.util.Scanner;

public class P02ExamPreparation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int gradelow = Integer.parseInt(scanner.nextLine());
        double score = 0;
        int gradeLowCount = 0;
        int gradeNum = 0;
        String lastValidTask= "";
        String taskName = scanner.nextLine();
        while (!taskName.equals("Enough")) {
            int grade = Integer.parseInt(scanner.nextLine());
            if (grade <= 4) {
                gradeLowCount++;
            }
            if (gradeLowCount >= gradelow) {
                break;
            }
            score += grade;
            gradeNum++;
            lastValidTask = taskName;
            taskName = scanner.nextLine();
        }
        if (gradeLowCount >= gradelow) {
            System.out.printf("You need a break, %s poor grades.", gradelow);
        } else {
            System.out.printf("Average score: %.2f\n", score / gradeNum);
            System.out.printf("Number of problems: %d\n",gradeNum);
            System.out.printf("Last problem: %s", lastValidTask);
        }
    }
}
