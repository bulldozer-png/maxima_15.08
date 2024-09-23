package homework.hw8.Animals;

public class Horse extends Animal{
    public Horse(String food, String location) {
        this.food = food;
        this.location = location;
    }

    @Override
    public void eat() {
        System.out.println(this.food);
    }

    @Override
    public void makeNoise() {
        System.out.println("Лошадь ржёт.");
    }

    @Override
    public String toString() {
        return "Лошадь";
    }
}
