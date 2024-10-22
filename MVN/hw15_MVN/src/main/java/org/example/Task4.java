package org.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.Scanner;

public class Task4 {

    private static final Logger logger = LoggerFactory.getLogger(Task4.class);


    public static void main(String[] args) {
        logger.info("Начало программы");
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> strings = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            strings.add(i, scanner.nextLine());
        }
        logger.warn("Значения - дублировались!!!");
        strings = doubleValues(strings);

        logger.info("Вывод модифицированного массива:");
        for (String str : strings) {
            System.out.println(str);
        }


    }

    public static ArrayList<String> doubleValues(ArrayList<String> strings) {
        ArrayList<String> tempStrings = new ArrayList<>();

        for (String element : strings) {
            tempStrings.add(element);
            tempStrings.add(element);
        }

        return tempStrings;
    }
}
