package hw2;

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        /**
         * 8 Task
         * */

        Scanner scanner = new Scanner(System.in);

        double t = scanner.nextDouble();
        double fractionalPart = t % 5;

        if (fractionalPart >= 0 && fractionalPart < 3) {
            System.out.println("зелёный");

        } else if (fractionalPart >= 3 && fractionalPart < 4) {
            System.out.println("жёлтый");

        } else if (fractionalPart >= 4 && fractionalPart < 5) {
            System.out.println("красный");
        }

    }
}
