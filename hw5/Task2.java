package homework.hw5;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String[] allWords = new String[5];

        for (int i = 0; i < allWords.length; i++) {
            String someText = scanner.next();
            allWords[i] = someText;
        }

        for (int k = 0; k < allWords.length; k++) {
            for (int j = 0; j < allWords.length - 1 - k; j++) {
                if (allWords[j].length() - allWords[j + 1].length() > 0) {
                    String temp = allWords[j + 1];
                    allWords[j + 1] = allWords[j];
                    allWords[j] = temp;
                }
            }
        }


        System.out.printf("Самая короткая строка - '%s' %d \nСамая длинная строка - '%s' %d", allWords[0], allWords[0].length(), allWords[allWords.length - 1], allWords[allWords.length - 1].length());

    }
}
