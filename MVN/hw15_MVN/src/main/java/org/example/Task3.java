package org.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.Iterator;

public class Task3 {

    private static final Logger logger = LoggerFactory.getLogger(Task3.class);


    public static void main(String[] args) {

        ArrayList<String> strings = new ArrayList<String>();
        strings.add("роза");
        strings.add("лоза");
        strings.add("лира");
        strings.add("тест");
        strings.add("роза");
        strings = fix(strings);


        for (String str : strings) {
            logger.info("Выводим элемент массива: {}", str);
//            System.out.print(str);
        }
    }


    public static ArrayList<String> fix(ArrayList<String> strings) {
        logger.warn("Метод fix запушен!");
        Iterator<String> iterator = strings.iterator();

        while (iterator.hasNext()) {
            String element = iterator.next();

            if (element.contains("р") && element.contains("л")) {
                continue;

            } else if (element.contains("р")) {
                iterator.remove();

            } else if (element.contains("л")) {
                int index = strings.indexOf(element);
                strings.set(index, element.repeat(2));

            }
        }
        return strings;
    }
}
