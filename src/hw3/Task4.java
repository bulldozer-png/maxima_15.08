package hw3;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int sum = 0;

        while (true) {
            int number = scanner.nextInt();

            if (number == -1) {
                sum = sum - 1;
                break;
            }

            sum = sum + number;

        }
        System.out.println("Сумма чисел равна " + sum);

    }
}
