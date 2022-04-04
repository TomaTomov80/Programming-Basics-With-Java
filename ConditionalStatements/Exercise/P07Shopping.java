package ConditionalStatements.Exercise;

import java.util.Scanner;

public class P07Shopping {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budgetPeter = Double.parseDouble(scanner.nextLine());
        int videocardNum = Integer.parseInt(scanner.nextLine());
        int processorNum = Integer.parseInt(scanner.nextLine());
        int ramNum = Integer.parseInt(scanner.nextLine());
        double videocardAllPrice = videocardNum * 250;
        double processorAllPrice = videocardAllPrice * 0.35 * processorNum;
        double ramAllPrice = videocardAllPrice * 0.1 * ramNum;
        double priceAll = videocardAllPrice + processorAllPrice + ramAllPrice;
        if ( videocardNum > processorNum){
            priceAll *= 0.85;
        }
        double diff = Math.abs(budgetPeter - priceAll);
        if (budgetPeter >= priceAll){
            System.out.printf("You have %.2f leva left!", diff);
        }else{
            System.out.printf("Not enough money! You need %.2f leva more!", diff);
        }
    }
}
