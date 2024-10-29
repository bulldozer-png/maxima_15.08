package ru.maxima;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import ru.maxima.model.*;

public class Main {
    public static void main(String[] args) {

        ClassPathXmlApplicationContext context
                = new ClassPathXmlApplicationContext("applicationContext.xml");

        Zoo zoo = context.getBean(Zoo.class);
        zoo.showAnimalInfo();

        context.close();

    }
}
