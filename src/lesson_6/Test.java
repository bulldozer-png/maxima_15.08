package lesson_6;

public class Test {
    public static void main(String[] args) {

        int a = 5;

        Cat cat = new Cat();

        cat.nameThisCat();
        cat.printNameOfCat();
        cat.meow();

        int smartCatNumber = cat.countDifficultNumbers(218, 691);

        System.out.println(smartCatNumber);

        cat.iAmHere();

    }
}
