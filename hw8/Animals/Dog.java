package homework.hw8.Animals;

public class Dog extends Animal {
    public Dog(String food, String location) {
        super(food, location);
    }

    @Override
    public void eat() {
        System.out.println("Собака есть корм.");
    }

    @Override
    public void makeNoise() {
        System.out.println("Собака лает.");
    }

    @Override
    public String toString() {
        return "Собака";
    }
}
