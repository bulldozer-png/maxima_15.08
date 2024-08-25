package hw2;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int num = scanner.nextInt();
        int cnst = 5;

        if (num > cnst) {
            System.out.println("Число больше " + cnst);
        } else if (num < cnst) {
            System.out.println("Число меньше " + cnst);
        } else {
            System.out.println("Число равно " + cnst);
        }

    }
}
