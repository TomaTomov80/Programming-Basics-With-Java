package WhileLoop.Lab;

import java.util.Scanner;

public class P02Password {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String userName = scanner.nextLine();
        String password = scanner.nextLine();
        String nextPassword = scanner.nextLine();
        while (!password.equals(nextPassword)){
            nextPassword = scanner.nextLine();
        }
        System.out.printf("Welcome %s!", userName);
    }
}
