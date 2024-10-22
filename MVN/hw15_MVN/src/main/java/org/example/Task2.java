package org.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;

public class Task2 {

    private static final Logger logger = LoggerFactory.getLogger(Task2.class);


    public static void main(String[] args) {

        List<String> strings = new ArrayList<>();
        strings.add("мама");
        strings.add("мыла");
        strings.add("раму");

        logger.info("Запуск цикла: {}", strings);
        for (int i = 0; i < 3; i++) {
            strings.add(i + i + 1, "именно");
        }
        logger.warn("Цикл завершён!");

        logger.info("Вывод модифицированного цикла: {}", strings);
        strings.forEach(System.out::println);

    }
}
