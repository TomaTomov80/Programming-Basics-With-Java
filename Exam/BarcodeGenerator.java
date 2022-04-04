package Exam;

import java.util.Scanner;

public class BarcodeGenerator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n1 = Integer.parseInt(scanner.nextLine());
        int n2 = Integer.parseInt(scanner.nextLine());
        for (int i = n1; i <= n2; i++) {
            if (((i % 10) % 2 != 0) && (((i / 10) % 10) % 2) != 0 && (((i / 100) % 10) % 2) != 0 && (((i / 1000) % 10) % 2) != 0) {
                if (((i % 10) >= (n1 % 10)) && (((i / 10) % 10) >= ((n1 / 10) % 10)) && (((i / 100) % 10) >= ((n1 / 100) % 10)) &&
                        (((i / 1000) % 10) >= ((n1 / 1000) % 10))) {
                    if (((i % 10) <= (n2 % 10)) && (((i / 10) % 10) <= ((n2 / 10) % 10)) && (((i / 100) % 10) <= ((n2 / 100) % 10)) &&
                            (((i / 1000) % 10) <= ((n2 / 1000) % 10))) {
                        System.out.printf("%d ", i);
                    }
                }
            }
        }
    }
}
