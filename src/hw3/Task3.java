package hw3;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();


        if ((num1 <= num2 && num1 >= num3) || (num1 >= num2 && num1 <= num3)) {
            System.out.println("Среднее число " + num1);

        } else if ((num2 <= num1 && num2 >= num3) || (num2 >= num1 && num2 <= num3)) {
            System.out.println("Среднее число " + num2);

        } else if ((num3 <= num1 && num3 >= num2) || (num3 >= num1 && num3 <= num2)) {
            System.out.println("Среднее число " + num3);

        } else if (num1 == num2 && num2 == num3) {
            System.out.println("Все числа между собой равны. Вывод: " + num1);
        }

    }
}
