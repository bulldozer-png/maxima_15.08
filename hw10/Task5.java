package homework.hw10;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        List<String> strings = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            strings.add(scanner.nextLine());
        }

        for (int i = 0; i < 13; i++) {
            String temp = strings.get(strings.size() - 1);
            strings.remove(strings.size() - 1);
            strings.add(0, temp);
        }

        for (String str : strings) {
            System.out.println(str);
        }

        scanner.close();
    }
}
