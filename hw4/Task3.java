package homework.hw4;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String[] lines = new String[10];
        int[] numbers = new int[10];

        int counter = 0;


        while (counter < lines.length) {
            lines[counter++] = scanner.nextLine();
        }

        for (int i = 0; i < lines.length; i++) {
            numbers[i] = lines[i].length();
            System.out.print(numbers[i] + " ");
        }

    }
}
