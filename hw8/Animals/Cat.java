package homework.hw8.Animals;

public class Cat extends Animal {
    public Cat(String food, String location) {
        super(food, location);
    }

    @Override
    public void eat() {
        System.out.println("Кот есть мокрый корм.");
    }

    @Override
    public void makeNoise() {
        System.out.println("Кот мяукает.");
    }

    @Override
    public String toString() {
        return "Кот";
    }
}
