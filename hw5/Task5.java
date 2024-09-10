package homework.hw5;

import java.util.Arrays;
import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String[] strings = new String[6];


        for (int i = 0; i < strings.length; i++) {
            String someText = scanner.next();
            strings[i] = someText;
        }

        for (int i = 0; i < strings.length; i++) {
            for (int j = 1; j < strings.length - 1; j++) {

                if (strings[j].equals(strings[i])) {
                    strings[i] = null;
                    break;
                }
            }
        }


        System.out.println(Arrays.toString(strings));

    }
}
