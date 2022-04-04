package ConditionalStatements.Exercise;

import java.util.Scanner;

public class FlowerShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int magnoliaNum = Integer.parseInt(scanner.nextLine());
        int hyacinthNum = Integer.parseInt(scanner.nextLine());
        int roseNum = Integer.parseInt(scanner.nextLine());
        int cactusNum = Integer.parseInt(scanner.nextLine());
        double presentPrice = Double.parseDouble(scanner.nextLine());
        double totalIncome = (magnoliaNum * 3.25 + hyacinthNum * 4 + roseNum * 3.5 + cactusNum * 8) * 0.95;
        double diff = Math.abs(presentPrice - totalIncome);
        if (totalIncome >= presentPrice){
            diff = Math.floor(diff);
            System.out.printf("She is left with %.0f leva.", diff);
        } else {
            diff = Math.ceil(diff);
            System.out.printf("She will have to borrow %.0f leva.", diff);
        }
    }
}
