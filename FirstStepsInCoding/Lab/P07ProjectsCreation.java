package FirstStepsInCoding.Lab;

import java.util.Scanner;

public class P07ProjectsCreation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String archName = scanner.nextLine();
        int projectNumber = Integer.parseInt(scanner.nextLine());
        int projectHours = projectNumber * 3;
        System.out.printf("The architect %s will need %d hours to complete %d project/s.", archName, projectHours, projectNumber);
    }
}
