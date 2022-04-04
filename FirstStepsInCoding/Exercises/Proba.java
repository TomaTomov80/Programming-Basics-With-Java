package FirstStepsInCoding.Exercises;

import java.util.Scanner;

public class Proba {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //•	Пакет химикали - 5.80 лв.
        //•	Пакет маркери - 7.20 лв.
        //•	Препарат - 1.20 лв (за литър)

        //прочитане на вход данни

        //От конзолата се четат 4 числа:

        //Брой пакети химикали - цяло число в интервала [0...100]
        //Брой пакети маркери - цяло число в интервала [0...100]
        //Литри препарат за почистване на дъска - цяло число в интервала [0…50]
        //Процент намаление - цяло число в интервала [0...100]


        int pakethimikalki = Integer.parseInt(scanner.nextLine());
        int paketimarkeri = Integer.parseInt(scanner.nextLine());
        int litripreparat = Integer.parseInt(scanner.nextLine());
        int procentnamalenie = Integer.parseInt(scanner.nextLine());
        //изчисление

        double pen = (pakethimikalki * 5.80);
        double marker = (paketimarkeri * 7.20);
        double litersofpreparation = (litripreparat * 1.20);

        //Цена без намаление =totalprice
        //цена с намаление = totalpricediskount = totalprice- (38.00 * 0.25) = 28.50 лв.

        double reshenie = pen + marker + litersofpreparation;

        double abc = (reshenie - reshenie * (procentnamalenie * 1.0 / 100));
        System.out.println(abc + " lv");


    }
}