package WhileLoop.Lab;

import java.util.Scanner;

public class P03SumNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstNum = Integer.parseInt(scanner.nextLine());
        int num = Integer.parseInt(scanner.nextLine());
        int sum = num;
        while (sum < firstNum) {
            num = Integer.parseInt(scanner.nextLine());
            sum += num;
        }
        System.out.println(sum);
    }
}
