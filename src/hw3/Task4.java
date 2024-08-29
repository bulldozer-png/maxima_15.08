package hw3;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int sum = 0;

        while (true) {

            int number = scanner.nextInt();
            sum = sum + number;

            if (number == -1) {
                break;
            }

        }
        System.out.println("Сумма чисел равна " + sum);

    }
}
