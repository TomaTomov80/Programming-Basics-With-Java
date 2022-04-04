package WhileLoop.Exercise;

import java.util.Scanner;

public class P01OldBooks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String bookNeeded = scanner.nextLine();
        String nextBook = scanner.nextLine();
        int bookCount = 0;
        while (!nextBook.equals(bookNeeded)) {
            if (nextBook.equals("No More Books")) {
                break;
            }
            bookCount++;
            nextBook = scanner.nextLine();
        }
        if (nextBook.equals("No More Books")) {
            System.out.println("The book you search is not here!");
            System.out.printf("You checked %d books.", bookCount);
        } else {
            System.out.printf("You checked %d books and found it.", bookCount);
        }
    }
}
