package ForLoop.Exercises;

import java.util.Scanner;

public class Proba {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Отворени табове (в условието на задачата са дадени като променливата n)
        int tabsOpen = Integer.parseInt(scanner.nextLine());
        // Заплата на служителя
        int salary = Integer.parseInt(scanner.nextLine());

        // For цикъл който изисква String INPUT за всеки един таб
        // и проверява дали String-а е "Facebook", "Instagram" или "Reddit"
        for (int i=0; i<tabsOpen; i++) {
            String site = scanner.nextLine();
            // Първи случай, ако сайта е Facebook -150лв от заплатата
            if (site.equals("Facebook")) {
                salary-= 150;
                if (salary<=0) {
                    System.out.println("You have lost your salary.");
                    // Използвал съм return вместо break,
                    // за да прекратя програмата, ако заплатата стане
                    // по-малка или равна на 0
                    return;
                }
            }else if (site.equals("Instagram")) {
                salary-= 100;
                if (salary<=0) {
                    System.out.println("You have lost your salary.");
                    return;
                }
            }else if (site.equals("Reddit")) {
                salary-= 50;
                if (salary<=0) {
                    System.out.println("You have lost your salary.");
                    return;
                }
            }

        }
        // Затваряне на скенера (ненужно при judge, но не пречи)
        scanner.close();
        // Ако програмата не бъде прекъсната от "return;" поради нулева или отрицателна заплата
        // кода под този коментар се изпълнява и показва остатъчната заплата
        System.out.println(salary);

    }
}