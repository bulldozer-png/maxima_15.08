package ru.maxima.hw17.an_radio;


import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {

        ClassPathXmlApplicationContext context
                = new ClassPathXmlApplicationContext("applicationContext.xml");


        RadioPlayer player = context.getBean("player", RadioPlayer.class);
        player.play();



        context.close();

    }
}
