package ConditionalStatements.Exercise;

import java.util.Scanner;

public class P03TimePlus15Minutes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int hour = Integer.parseInt(scanner.nextLine());
        int munites = Integer.parseInt(scanner.nextLine());
        int minutesPlus15 = munites + 15;
        if (minutesPlus15 > 59) {
            hour += 1;
            minutesPlus15 -= 60;
        }
        if ( hour > 23){
            hour = 0;
        }
        System.out.printf("%d:%02d", hour, minutesPlus15 );
    }
}
