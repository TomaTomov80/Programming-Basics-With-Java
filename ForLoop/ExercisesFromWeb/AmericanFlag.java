package ForLoop.ExercisesFromWeb;

public class AmericanFlag {
    public static void main(String[] args) {
        for (int i = 1; i <= 15; i++) {
            if (i >= 10) {
                for (int j = 1; j <= 47; j++) {
                    System.out.print("=");
                }
                System.out.println();
            }
            if (i % 2 == 0 && i < 10) {
                for (int j = 0; j < 40; j++) {
                    if (j > 6) {
                        System.out.print("=");
                    } else  {
                        System.out.print("* ");
                    }
                }
                System.out.println();
            }
            if (i % 2 != 0 && i < 10) {
                for (int j = 0; j <= 40; j++) {
                    if (j == 0) {
                        System.out.print(" ");
                    }
                    if (j == 7) {
                        System.out.print(" ");
                    }
                    if (j > 7) {
                        System.out.print("=");
                    }
                    if (j >= 1 && j <= 6) {
                        System.out.print("* ");
                    }
                }
                System.out.println();
            }
        }
    }
}
