package FirstStepsInCoding.Exercises;

import java.util.Scanner;

public class TennisEquipment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double tennisRacketPrice = Double.parseDouble(scanner.nextLine());
        int tennisRacketNum = Integer.parseInt(scanner.nextLine());
        int sneakersNum = Integer.parseInt(scanner.nextLine());
        double tennisRacketPriceAll = tennisRacketNum * tennisRacketPrice;
        double sneakersPriceForPair = tennisRacketPrice / 6;
        double sneakersPriceForAll = sneakersNum * sneakersPriceForPair;
        double moneyForRest = (tennisRacketPriceAll + sneakersPriceForAll) * 0.2;
        double fullPrice = tennisRacketPriceAll + sneakersPriceForAll + moneyForRest;
        double priceForDjokovic = Math.floor(fullPrice / 8);
        int priceForDjokovicInt = (int) priceForDjokovic;
        double priceForSponsors = Math.ceil(fullPrice * 7 / 8);
        int priceForSponsorsInt = (int) priceForSponsors;
        System.out.println("Price to be paid by Djokovic " + priceForDjokovicInt);
        System.out.println("Price to be paid by sponsors " +  priceForSponsorsInt);
    }
}
