package org.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.Scanner;

public class Task5 {

    private static final Logger logger = LoggerFactory.getLogger(Task5.class);


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ArrayList<String> strings = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            strings.add(i, scanner.nextLine());
        }
        logger.info("Запускаем проверку длин строк");
        checkOrder(strings);
    }

    public static void checkOrder(ArrayList<String> strings) {

        for (int i = 0; i < strings.size() - 1; i++) {
            if (strings.get(i).length() > strings.get(i + 1).length()) {
                System.out.println("Индекс: " + (i + 1));
                break;
            }
        }
        logger.error("Индекс обнаружен!");

    }
}
