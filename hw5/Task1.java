package homework.hw5;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        do {
            String someText = scanner.nextLine();
            if (someText.isEmpty()) {
                break;
            } else if (someText.length() % 2 == 0) {
                System.out.println(someText.repeat(2));
            } else {
                System.out.println(someText.repeat(3));
            }

        } while (true);

    }
}
