package FirstStepsInCoding.Lab;

import java.util.Scanner;

public class P01HelloSoftUni {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Write your firts name: ");
        String myName = scanner.nextLine();
        System.out.println(myName + " says HelloSoftUni");

    }
}
