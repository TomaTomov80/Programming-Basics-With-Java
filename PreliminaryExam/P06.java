package PreliminaryExam;

import java.util.Scanner;

public class P06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int count = 0;
        for (int a = 1; a <= 9; a++) {
            for (int b = 9; b >= a; b--) {
                for (int c = 0; c <= 9; c++) {
                    for (int d = 9; d >= c; d--) {
                        if ((a + b + c + d) == (a * b * c * d) && n % 10 == 5) {
                            System.out.printf("%d%d%d%d", a, b, c, d);
                            count++;
                            break;
                        }
                        if ((a * b * c * d) / (a + b + c + d) == 3 && n % 3 == 0) {
                            System.out.printf("%d%d%d%d", d, c, b, a);
                            count++;
                            break;
                        }
                    }
                    if (count == 1) {
                        break;
                    }
                }
                if (count == 1) {
                    break;
                }
            }
            if (count == 1) {
                break;
            }
        }
        if (count == 0) {
            System.out.println("Nothing found");
        }
    }
}