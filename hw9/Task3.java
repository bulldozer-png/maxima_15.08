package homework.hw9;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        List<String> strings = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            strings.add(scanner.nextLine());
        }

        List<String> minStrings = new ArrayList<>();
        int minLength = Integer.MAX_VALUE;

        for (String str : strings) {
            if (str.length() < minLength) {
                minStrings.clear();
                minStrings.add(str);
                minLength = str.length();
            } else if (str.length() == minLength) {
                minStrings.add(str);
            }

        }

        for (String maxStr : minStrings) {
            System.out.println(maxStr);
        }

    }
}
