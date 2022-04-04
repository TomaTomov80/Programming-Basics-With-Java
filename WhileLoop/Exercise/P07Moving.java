package WhileLoop.Exercise;

import java.util.Scanner;

public class P07Moving {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int width = Integer.parseInt(scanner.nextLine());
        int length = Integer.parseInt(scanner.nextLine());
        int height = Integer.parseInt(scanner.nextLine());
        int space = width * length * height;
        while (space > 0) {
            String boxesStr = scanner.nextLine();
            if (boxesStr.equals("Done")) {
                break;
            }
            int boxes = Integer.parseInt(boxesStr);
            space = space - boxes;
        }
        if (space <= 0) {
            System.out.printf("No more free space! You need %d Cubic meters more.", Math.abs(space));
        } else {
            System.out.printf("%d Cubic meters left.", space);
        }
    }
}
