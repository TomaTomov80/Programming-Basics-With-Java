package WhileLoop.Exercise;

import java.util.Scanner;

public class P06Cake {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int width = Integer.parseInt(scanner.nextLine());
        int length = Integer.parseInt(scanner.nextLine());
        int cakeLeft = width * length;
        while (cakeLeft > 0) {
            String cakeEaten = scanner.nextLine();
            if (cakeEaten.equals("STOP")) {
                break;
            }
            int cakeEatenInt = Integer.parseInt(cakeEaten);
            cakeLeft = cakeLeft - cakeEatenInt;
        }
        if (cakeLeft > 0) {
            System.out.printf("%d pieces are left.", cakeLeft);
        } else {
            System.out.printf("No more cake left! You need %d pieces more.", Math.abs(cakeLeft));
        }
    }
}
