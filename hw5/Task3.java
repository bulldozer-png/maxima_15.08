package homework.hw5;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String[] allWords = new String[10];
        int maxCustomWords = 8;

        for (int i = 0; i < maxCustomWords; i++) {
            allWords[i] = scanner.next();
        }

        for (int i = allWords.length - 1; i >= 0; i--) {
            System.out.println(allWords[i]);
        }

    }
}
