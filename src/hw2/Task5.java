package hw2;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        /**
         * 6 Task
         * */

        Scanner scanner = new Scanner(System.in);

        int year = scanner.nextInt();
        int x = 365;

        if (year % 400 == 0) {
            System.out.println("количество дней в этом году: " + ++x);
        } else if (year % 100 == 0) {
            System.out.println("количество дней в этом году: " + x);
        } else if (year % 4 == 0) {
            System.out.println("количество дней в этом году: " + ++x);
        } else {
            System.out.println("количество дней в этом году: " + x);
        }

    }
}
