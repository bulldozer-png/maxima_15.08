package homework.hw10;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        List<String> strings = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            strings.add(scanner.nextLine());
        }

        String minResult = strings.get(0);
        String maxResult = strings.get(0);
        int minIndex = 0;
        int maxIndex = 0;


        for (int i = 1; i < strings.size(); i++) {
            if (minResult.length() > strings.get(i).length()) {
                minResult = strings.get(i);
                minIndex = i;
            }
            if (maxResult.length() < strings.get(i).length()) {
                maxResult = strings.get(i);
                maxIndex = i;
            }
        }

        if (maxIndex < minIndex) {
            System.out.println("Длинная строка встречается раньше: " + maxResult);
        } else if (maxIndex > minIndex) {
            System.out.println("Короткая строка встречается раньше: " + minResult);
        } else {
            System.out.println("Длина строк одинаковая.");
        }

    }
}
