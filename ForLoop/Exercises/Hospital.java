package ForLoop.Exercises;

import java.util.Scanner;

public class Hospital {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int patIns = 0;
        int patNonIns = 0;
        int doctorNum = 7;
        for (int i = 1; i <= n; i++) {
            int patNum = Integer.parseInt(scanner.nextLine());
            if (i % 3 == 0 && patNonIns > patIns) {
                doctorNum++;
            }
            if (patNum > doctorNum) {
                patNonIns = patNonIns + (patNum - doctorNum);
                patIns = patIns + doctorNum;
            } else {
                patIns = patIns + patNum;
            }
        }
        System.out.printf("Treated patients: %d.\n", patIns);
        System.out.printf("Untreated patients: %d.", patNonIns);
    }
}
