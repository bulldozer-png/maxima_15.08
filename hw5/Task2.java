package homework.hw5;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String[] allWords = new String[5];

        for (int i = 0; i < allWords.length; i++) {
            allWords[i] = scanner.next();
        }

        String maxLengthStr = allWords[0];
        String minLengthStr = allWords[0];

        for (int j = 1; j < allWords.length; j++) {
            if (allWords[j].length() > maxLengthStr.length()) {
                maxLengthStr = allWords[j];
            }

            if (allWords[j].length() < minLengthStr.length()) {
                minLengthStr = allWords[j];
            }
        }

        System.out.printf("Самая короткая строка - '%s' %d \nСамая длинная строка - '%s' %d", minLengthStr, minLengthStr.length(), maxLengthStr, maxLengthStr.length());

    }
}
