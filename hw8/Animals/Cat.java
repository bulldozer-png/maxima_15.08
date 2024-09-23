package homework.hw8.Animals;

public class Cat extends Animal {
    public Cat(String food, String location) {
        this.food = food;
        this.location = location;
    }

    @Override
    public void eat() {
        System.out.println(this.food);
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
