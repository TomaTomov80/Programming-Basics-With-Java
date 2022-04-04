package ForLoop.Exercises;

import java.util.Scanner;

public class P07TrekkingMania {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int allPeople = 0;
        int musalaNum = 0;
        int monblanNum = 0;
        int kilNum = 0;
        int k2Num = 0;
        int everstNum = 0;
        for (int i = 1; i <= n; i++) {
            int groupNum = Integer.parseInt(scanner.nextLine());
            if (groupNum <= 5) {
                musalaNum += groupNum;
            } else if (groupNum <= 12) {
                monblanNum += groupNum;
            } else if (groupNum <= 25) {
                kilNum += groupNum;
            } else if (groupNum <= 40) {
                k2Num += groupNum;
            } else  {
                everstNum += groupNum;
            }
            allPeople = allPeople + groupNum;
        }
        System.out.printf("%.2f%%\n", (1.0 * musalaNum / allPeople) * 100);
        System.out.printf("%.2f%%\n", (1.0 * monblanNum / allPeople) * 100);
        System.out.printf("%.2f%%\n", (1.0 * kilNum / allPeople) * 100);
        System.out.printf("%.2f%%\n", (1.0 * k2Num / allPeople) * 100);
        System.out.printf("%.2f%%", (1.0 * everstNum / allPeople) * 100);
    }
}
