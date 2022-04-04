package FirstStepsInCoding.Exercises;

import java.util.Scanner;

public class P04VacationBooksList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int bookSheetNumber = Integer.parseInt(scanner.nextLine());
        int sheetNumberPerOur = Integer.parseInt(scanner.nextLine());
        int daysPerBook = Integer.parseInt(scanner.nextLine());
        int hoursPerBook = bookSheetNumber / sheetNumberPerOur;
        int hoursPerDay = hoursPerBook / daysPerBook;
        System.out.println(hoursPerDay);
    }
}
