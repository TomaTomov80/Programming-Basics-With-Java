package Exam;

import java.util.Scanner;

public class P03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String team = scanner.nextLine();
        String souvenir = scanner.nextLine();
        int souvNem = Integer.parseInt(scanner.nextLine());
        double price = 0;
        boolean isValid = true;
        switch (team) {
            case "Argentina":
                switch (souvenir) {
                    case "flags":
                        price = 3.25;
                        break;
                    case "caps":
                        price = 7.2;
                        break;
                    case "posters":
                        price = 5.1;
                        break;
                    case "stickers":
                        price = 1.25;
                        break;
                    default:
                        isValid = false;
                        System.out.println("Invalid stock!");
                        break;
                }
                break;
            case "Brazil":
                switch (souvenir) {
                    case "flags":
                        price = 4.2;
                        break;
                    case "caps":
                        price = 8.5;
                        break;
                    case "posters":
                        price = 5.35;
                        break;
                    case "stickers":
                        price = 1.2;
                        break;
                    default:
                        isValid = false;
                        System.out.println("Invalid stock!");
                        break;
                }
                break;
            case "Croatia":
                switch (souvenir) {
                    case "flags":
                        price = 2.75;
                        break;
                    case "caps":
                        price = 6.9;
                        break;
                    case "posters":
                        price = 4.95;
                        break;
                    case "stickers":
                        price = 1.1;
                        break;
                    default:
                        isValid = false;
                        System.out.println("Invalid stock!");
                        break;
                }
                break;
            case "Denmark":
                switch (souvenir) {
                    case "flags":
                        price = 3.10;
                        break;
                    case "caps":
                        price = 6.5;
                        break;
                    case "posters":
                        price = 4.8;
                        break;
                    case "stickers":
                        price = 0.9;
                        break;
                    default:
                        isValid = false;
                        System.out.println("Invalid stock!");
                        break;
                }
                break;
            default:
                isValid = false;
                System.out.println("Invalid country!");
                break;
        }
        if (isValid){
            System.out.printf("Pepi bought %d %s of %s for %.2f lv.", souvNem, souvenir, team, souvNem * price);
        }
    }
}
