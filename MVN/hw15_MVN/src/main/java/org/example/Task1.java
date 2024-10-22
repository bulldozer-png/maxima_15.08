package org.example;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Task1 {

    private static final Logger logger = LoggerFactory.getLogger(Task1.class);

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<String> strings = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            logger.info("Добавьте элемент: {}", i + 1);
            strings.add(i, scanner.nextLine());
        }
        strings.remove(2);
        Collections.reverse(strings);

        logger.warn("Третий элемент удалён!");
        strings.forEach(System.out::println);

    }
}
