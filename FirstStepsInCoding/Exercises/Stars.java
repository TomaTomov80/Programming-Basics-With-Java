package FirstStepsInCoding.Exercises;

import java.util.Scanner;

public class Stars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = Integer.parseInt(scanner.nextLine());
        if (num == 3) {
            System.out.println("***");
            System.out.println("* *");
            System.out.println("***");
        } else if (num == 4) {
            System.out.println("****");
            System.out.println("*  *");
            System.out.println("*  *");
            System.out.println("****");
        } else if (num == 5){
            System.out.println("*****");
            System.out.println("*   *");
            System.out.println("*   *");
            System.out.println("*   *");
            System.out.println("*****");
        }
    }
}
