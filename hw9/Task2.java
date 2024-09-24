package homework.hw9;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        List<String> strings = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            strings.add(scanner.nextLine());
        }

        List<String> maxStrings = new ArrayList<>();
        int maxLength = 0;

        for (String str : strings) {
            if (str.length() > maxLength) {
                maxStrings.clear();
                maxStrings.add(str);
                maxLength = str.length();
            } else if (str.length() == maxLength) {
                maxStrings.add(str);
            }

        }

        for (String maxStr : maxStrings) {
            System.out.println(maxStr);
        }

    }
}
