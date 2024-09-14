package homework.hw5;

import java.util.Arrays;
import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String[] strings = new String[6];

        for (int i = 0; i < strings.length; i++) {
            strings[i] = scanner.next();
        }

        for (int i = 0; i < strings.length; i++) {
            String tempItemValue = strings[i];

            if (tempItemValue != null) {
                for (int j = i + 1; j < strings.length; j++) {

                    if (tempItemValue.equals(strings[j])) {
                        strings[i] = null;
                        strings[j] = null;
                    }

                }
            }
        }

        System.out.println(Arrays.toString(strings));

    }
}
