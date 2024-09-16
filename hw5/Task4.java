package homework.hw5;

import java.util.Arrays;
import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String[] allWords = new String[10];
        int[] allNumbers = new int[10];


        for (int i = 0; i < allWords.length; i++) {
            String someText = scanner.next();
            allWords[i] = someText;
            allNumbers[i] = someText.length();
        }

        System.out.println(Arrays.toString(allWords));
        System.out.println(Arrays.toString(allNumbers));


    }
}
