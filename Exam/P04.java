package Exam;

import java.util.Scanner;

public class P04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int catNum = Integer.parseInt(scanner.nextLine());
        int g1 = 0;
        int g2 = 0;
        int g3 = 0;
        double sum = 0;
        for (int i = 1; i <= catNum; i++) {
            double foodEat = Double.parseDouble(scanner.nextLine());
            if (foodEat >= 100 && foodEat < 200){
                g1++;
            } else if (foodEat >= 200 && foodEat < 300){
                g2++;
            } else if(foodEat >= 300 && foodEat < 400){
                g3++;
            }
            sum += foodEat;
        }
        System.out.printf("Group 1: %d cats.\n", g1);
        System.out.printf("Group 2: %d cats.\n", g2);
        System.out.printf("Group 3: %d cats.\n", g3);
        System.out.printf("Price for food per day: %.2f lv.", (sum / 1000) * 12.45);
    }
}
