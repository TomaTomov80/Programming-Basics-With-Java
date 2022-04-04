package ConditionalStatements.Exercise;

import java.util.Scanner;

public class AddBags {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double priceLugMore = Double.parseDouble(scanner.nextLine());
        double luggageKgs = Double.parseDouble(scanner.nextLine());
        int daysToTrip = Integer.parseInt(scanner.nextLine());
        int luggageNum = Integer.parseInt(scanner.nextLine());
        if (luggageKgs < 10) {
            priceLugMore = priceLugMore * 0.2;
        } else if (luggageKgs <= 20){
            priceLugMore = priceLugMore * 0.5;
        }
        if ( daysToTrip < 7){
            priceLugMore = priceLugMore * 1.4;
        } else if (daysToTrip <= 30){
            priceLugMore = priceLugMore * 1.15;
        } else {
            priceLugMore = priceLugMore * 1.1;
        }
        double totalprice = luggageNum * priceLugMore;
        System.out.printf("The total price of bags is: %.2f lv.", totalprice);

    }
}
