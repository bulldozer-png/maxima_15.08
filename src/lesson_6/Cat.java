package lesson_6;

public class Cat {

    // Характеристики
    // Поля / fields

    int age;
    String name;

    public void nameThisCat(){
        name = "Barsik";
    }

    public void meow(){
        System.out.println("NEOW");
    }

    public void printNameOfCat(){
        System.out.println(name);
    }

    public int countDifficultNumbers(int a, int b){
        int result = a * b;
        return result;
    }

    void iAmHere(){
        System.out.println("I am cat and i am here");
    }

}
