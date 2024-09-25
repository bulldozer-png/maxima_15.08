package homework.hw8.Animals;

public class Cat extends Animal {

    private boolean isScientific;

    public Cat(String food, String location, boolean isScientific) {
        this.food = food;
        this.location = location;
        this.isScientific = isScientific;
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
        if (isScientific){
            return "Кот учёный";
        }
        return "Кот";
    }
}
