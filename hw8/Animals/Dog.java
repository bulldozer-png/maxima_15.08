package homework.hw8.Animals;

public class Dog extends Animal {
    public Dog(String food, String location) {
        this.food = food;
        this.location = location;
    }

    @Override
    public void eat() {
        System.out.println(this.food);
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
