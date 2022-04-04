package ConditionalStatementsAdvanced.Exercises;

import java.util.Scanner;

public class P01Cinema {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String typeEvent = scanner.nextLine();
        int row = Integer.parseInt(scanner.nextLine());
        int column = Integer.parseInt(scanner.nextLine());
        int allSeats = row * column;
        double totalPrice = 0;
        switch (typeEvent) {
            case "Premiere":
                totalPrice = allSeats * 12.0;
                break;
            case "Normal":
                totalPrice = allSeats * 7.5;
                break;
            case "Discount":
                totalPrice = allSeats * 5.0;
                break;
        }
        System.out.printf("%.2f leva", totalPrice);

    }
}
