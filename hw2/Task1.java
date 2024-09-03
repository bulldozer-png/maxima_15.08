package homework.hw2;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();
        int compareWith = 5;

        if (number > compareWith) {
            System.out.println("Число больше " + compareWith);

        } else if (number < compareWith) {
            System.out.println("Число меньше " + compareWith);

        } else {
            System.out.println("Число равно " + compareWith);
        }

    }
}
