package homework.hw12;

import java.util.ArrayList;
import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ArrayList<String> strings = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            strings.add(i, scanner.nextLine());
        }

        checkOrder(strings);
    }

    public static void checkOrder(ArrayList<String> strings) {

        for (int i = 0; i < strings.size() - 1; i++) {
            if (strings.get(i).length() > strings.get(i + 1).length()) {
                System.out.println("Индекс: " + (i + 1));
                break;
            }
        }

    }
}
