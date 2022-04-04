package ConditionalStatementsAdvanced.Exercises;

import java.util.Scanner;

public class Proba {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int Joinery = Integer.parseInt(scanner.nextLine());
        String Type = scanner.nextLine();
        String Delivery = scanner.nextLine();
        double Price = 0;
        switch (Type){
            case "90X130":
                if (Joinery < 10){
                    System.out.println("Invalid order.");
                } else if (Joinery > 30){
                    Price = Joinery * 110 - Joinery * 110 * 0.05;
                } else if (Joinery > 60){
                    Price = Joinery * 110 - Joinery * 110 * 0.08;
                }
                break;

            case "100X150":
                if (Joinery < 10){
                    System.out.println("Invalid order");
                } else if (Joinery > 40){
                    Price = Joinery * 140 - Joinery * 140 * 0.06;
                } else if (Joinery > 80){
                    Price = Joinery * 140 - Joinery * 140 * 0.1;

                }
                break;
            case "130X180":
                if (Joinery < 10){
                    System.out.println("Invalid order");
                } else if (Joinery > 20){
                    Price = Joinery * 190 - Joinery * 190 * 0.07;
                } else if (Joinery > 50){
                    Price = Joinery * 190 - Joinery * 190 * 0.12;
                }
                break;
            case "200X300":
                if (Joinery < 10){
                    System.out.println("Invalid order");
                } else if (Joinery > 25){
                    Price = Joinery * 250 - Joinery * 250 * 0.09;
                } else if (Joinery > 50){
                    Price = Joinery * 250 - Joinery * 250 * 0.14;
                }
                break;
            default:
                System.out.println("Invalid order");
                break;
        }
        if (Delivery.equals("With delivery")){
            Price = Price + 60;

        }
        if (Joinery > 99){
            Price = Price - Price * 4/100;
        }
        System.out.printf("%.2f BGN", Price);

    }
}