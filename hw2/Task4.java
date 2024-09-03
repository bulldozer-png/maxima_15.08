package homework.hw2;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();

        if (number > 0) {
            number = number * 2;
            System.out.println(number);

        } else if (number < 0) {
            number = number + 1;
            System.out.println(number);

        } else {
            System.out.println(0);
        }

    }
}
