package WhileLoop.Lab;

import java.util.Scanner;

public class P04Sequence2kPlus1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = Integer.parseInt(scanner.nextLine());
        int currNum = 1;
        while (currNum <= num){
            System.out.println(currNum);
            currNum = currNum * 2 + 1;

        }
    }
}
