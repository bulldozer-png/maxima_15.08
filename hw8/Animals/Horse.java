package homework.hw8.Animals;

public class Horse extends Animal{
    public Horse(String food, String location) {
        super(food, location);
    }

    @Override
    public void eat() {
        System.out.println("Лошадь есть морковь и яблоки.");
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
