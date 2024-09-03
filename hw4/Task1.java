package homework.hw4;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String[] lines = new String[10];

        int counter = 0;

        while (counter < 8) {
            lines[counter++] = scanner.nextLine();
        }

        counter = 9;

        while (counter >= 0) {
            System.out.println(lines[counter--]);
        }

    }
}
